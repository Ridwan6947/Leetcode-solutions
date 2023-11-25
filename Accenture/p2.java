import java.util.Scanner;

public class p2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the non-balanced compound
        String compound = scanner.nextLine();

        // Input the equivalent point
        int equivalentPoint = Integer.parseInt(scanner.nextLine());

        // Output the result
        solve(compound, equivalentPoint);

        scanner.close();
    }

    public static void solve(String compound, int equivalentPoint) {
        char firstElement = compound.charAt(0);
        char secondElement = compound.charAt(1);

        int valencyFirst = calculateValency(firstElement);
        int valencySecond = calculateValency(secondElement);

        int multiple = 1;
        boolean isPossible = false;

        // Iterate to find the multiples and check if it reaches the equivalent point
        while (valencyFirst * multiple <= equivalentPoint) {
            int remaining = equivalentPoint - (valencyFirst * multiple);
            if (remaining % valencySecond == 0) {
                int multipleSecond = remaining / valencySecond;
                System.out.println(firstElement + "" + multiple + " " + secondElement + "" + multipleSecond);
                isPossible = true;
            }
            multiple++;
        }

        // Output "Not Possible" if no combination is found
        if (!isPossible) {
            System.out.println("Not Possible");
        }
    }

    public static int calculateValency(char element) {
        // Calculate the valency of an element based on ASCII values
        int asciiValue = (int) element;
        return (asciiValue % 9) + 1;
    }
}
