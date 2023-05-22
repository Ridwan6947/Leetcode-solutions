import java.util.*;
import java.lang.*;

public class camelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "saveChangesInTheEditors";
        String ans = "";
        for(int i = 0 ; i < str.length() ; i++){
            char c = str.charAt(i);
            if('A' <= c && c <= 'Z'){
                System.out.println(ans);
                // int t = (int)c;
                ans = "";
                ans += (char)((int)c + 32);
            }
            else{
                ans += (char)((int)c - 32);
            }
        }
        System.out.println(ans);
    }
    
}
