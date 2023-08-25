import java.util.*;

public class findpermutation {

    public static void find(String str , String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //yes
        for(int i = 0 ; i < str.length() ; i++){
            char c = str.charAt(i);
            String newstr = str.substring(0,i) + str.substring(i+1);
            find(newstr,ans+c);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "123";
        String ans = "";
        find(str,ans);
    }
}
