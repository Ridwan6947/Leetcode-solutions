import java.util.*;

public class exchangeaplhabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        String ans = "";
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == ch1){
                ans = ans + ch2;
            }else if (str.charAt(i) == ch2){
                ans = ans + ch1;
            }else{
                ans = ans + str.charAt(i);
            }
        }
        System.out.println(ans);

    }
}
