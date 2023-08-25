import java.util.*;

public class findsubsets {

    public static void find(String str , String ans , int i,int n){
        //base case
        if(i == n){
            System.out.println(ans);
            return;
        }
        //recursive call
        //yes
        find(str,ans+str.charAt(i) , i+1,n);
        //No
        find(str,ans,i+1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        find(str,"",0,n);
    }
}
