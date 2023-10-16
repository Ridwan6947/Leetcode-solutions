import java.util.*;

public class avgascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0;
        for(int i = 0 ; i < str.length() ; i++){
            char c = str.charAt(i);
            sum += (int) c;
        }
        System.out.println((float)sum/str.length());
    }
}
