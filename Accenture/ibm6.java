import java.util.*;

public class ibm6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abbba";
        boolean res = solve(str);
        boolean res1 = solve(str);
        System.out.println(res);
    }
    // public static boolean solve(String str){
    //     int l = 0;
    //     int r = str.length()-1;
    //     while(l < r){
    //         if(str.charAt(l) != str.charAt(r)){
    //             return false;
    //         }
    //         l++;
    //         r--;
    //     }
    //     return true;
    // }
    public static boolean solve(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < str.length() ; i++){
            sb.append(str.charAt(i));
        }
        sb.reverse();
        return str.equals(sb.toString());
    }
}