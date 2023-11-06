import java.util.*;


public class adjacentXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        String bin = Integer.toBinaryString(n);
        String res = "";

        for(int i = 1 ; i < bin.length() ; i++){
            int bit1 = Character.getNumericValue(bin.charAt(i-1));
            int bit2 = Character.getNumericValue(bin.charAt(i));
            res += String.valueOf(bit1 ^ bit2);
        }
        res += String.valueOf(Character.getNumericValue(bin.charAt(bin.length()-1) ^ 1));
        int x = Integer.parseInt(res,2);
        System.out.println(x);
    }
}
