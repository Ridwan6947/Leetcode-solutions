import java.util.*;

public class ibm12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abcdefg";
        int k = 2;
        String ans = reverse(str,k);
        System.out.println(ans);
    }
    public static String reverse(String str , int k){
        char[] arr = str.toCharArray();
        for(int i = 0 ; i < arr.length ; i += 2*k){
            int l = i ; int r = Math.min(i + k -1 , arr.length - 1);
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return new String(arr);
    }
}
