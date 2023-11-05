import java.util.*;

public class makePalindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = "abcdc";
        System.out.print(fun(str));
    }
    public static String fun(String str){
        int n = str.length();
        int i = n-1;
        while(i >= 0 && !isPalindrome(str.substring(i))){
            i--;
        }
        StringBuilder sb = new StringBuilder();
        for(int j = n-1 ; j > i ; j--){
            sb.append(str.charAt(j));
        }
        return sb.toString();
    }
    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
