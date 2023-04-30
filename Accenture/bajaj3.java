import java.util.*;

public class bajaj3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Welcome to Coding Ninja";
        String str1 = reverse1(str);
        String str2 = reverse2(str);
        System.out.println(str1);
        System.out.println(str2);
    }
    // reverse the words only
    public static String reverse1(String str){
        StringBuilder sb = new StringBuilder();
        String[] arr = str.split(" ");
        for(int i = arr.length-1 ; i >= 0 ; i--){
            sb.append(arr[i]);
            sb.append(" ");
        }
        // sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
    // reverse the words and alphabets 
    public static String reverse2(String str){
        StringBuilder sb = new StringBuilder();
        String[] arr = str.split("");
        for(int i = arr.length-1 ; i >= 0 ; i--){
            sb.append(arr[i]);
            sb.append("");
        }
        // sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

}
