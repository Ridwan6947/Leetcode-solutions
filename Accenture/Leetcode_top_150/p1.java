import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int n = scanner.nextInt();
        long[] numbers = new long[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextLong();
        }

        // Find the smallest prime number
        long q = findSmallestPrime(numbers);

        if (q == -1) {
            System.out.println("None");
        } else {
            System.out.println(q);
        }

        scanner.close();
    }

    // Function to find the smallest prime number using optimization
    private static long findSmallestPrime(long[] numbers) {
        long q = Long.MAX_VALUE;

        for (long num : numbers) {
            if (num < q) {
                q = num;
            }
        }

        if (q == 2) {
            return 2;
        }

        if (q % 2 == 0) {
            return -1;
        }

        long p = q;
        boolean found = false;
        while (!found) {
            p += 2;
            boolean isPrimeP = isPrime(p);
            if (isPrimeP) {
                boolean valid = true;
                for (long num : numbers) {
                    if (num != q && p % num != q) {
                        valid = false;
                        break;
                    }
                }
                if (valid) {
                    found = true;
                }
            }
        }

        return p;
    }

    // Function to check if a number is prime using efficient method
    private static boolean isPrime(long num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (long i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
