import java.util.*;

public class binaryadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "11";
        String str2 = "1";
        String ans = solve(str1,str2);
        System.out.println(ans);
    }
    public static String solve(String str1 , String str2){
        StringBuilder sb = new StringBuilder();
        int i = str1.length()-1;
        int j = str2.length()-1;
        int sum = 0;
        int carry = 0;
        while(i >= 0 || j >= 0){
            sum = carry;
            if(j>=0) sum += str2.charAt(j--) - '0';
            if(i>=0) sum += str1.charAt(i--) - '0';
            sb.append(sum%2);
            carry = sum/2;
        }
        if(carry != 0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
