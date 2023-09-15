import java.util.*;

public class exchangeaplhabets {
    public static void main(String[] args) {
        String str = "aabb";
        char c1 = 'a';
        char c2 = 'b';
        String ans = "";
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == c1){
                ans = ans + c2;
            }else if(str.charAt(i) == c2){
                ans = ans + c1;
            }else{
                ans = ans + str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
