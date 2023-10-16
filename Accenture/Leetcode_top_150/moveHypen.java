import java.util.*;

public class moveHypen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Move-Hyphens-to-Front";
        String ans = "";
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == '-'){
                ans = str.charAt(i) + ans;
            }else{
                ans = ans + str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
