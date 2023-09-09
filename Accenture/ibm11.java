import java.util.*;

public class ibm11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "hello";
        String rev = reverse(str);
        System.out.println(rev);
    }
    public static String reverse(String str){
        // String ans = "";
        // for(int i = str.length()-1 ; i >= 0 ; i--){
        //     ans = ans+str.charAt(i);
        // }
        int l = 0;
        int r = str.length()-1;
        char [] arr = str.toCharArray();
        while(l <= r){
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        // return ans;
        String ans = new String(arr);
        return ans;
    }
}
