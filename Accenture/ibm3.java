import java.util.*;

public class ibm3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "a2b3c5";
        String ans = decode(str);
        System.out.println(ans);
    }
    public static String decode(String str){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = 0 ; i < str.length() ; i+=2){
            char c = str.charAt(i);
            count = Character.getNumericValue(str.charAt(i+1));
            // count = i;
            while(count > 0){
                sb.append(c);
                count--;
            }
        }
        return sb.toString();
    }
}
