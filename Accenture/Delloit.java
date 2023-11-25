import java.util.*;


public class Delloit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abbcdcaf";
        int posi = solve(str);
        System.out.println(posi);
    }
    public static int solve(String str) {
        int[] arr = new int[256];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (arr[str.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }
}