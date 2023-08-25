import java.util.*;

public class decimalTObinary {

    public static String ans(int n){
        if(n == 0){
            return "0";
        }
        if(n == 1){
            return "1";
        }
        int remainder = n % 2;
        int quotient = n/2;
        String result = ans(quotient) + remainder;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String bi = ans(n);
        System.out.println(bi);
    }
}
