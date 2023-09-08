import java.util.*;

public class ibm6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abbba";
        boolean res = solve(str);
        boolean res1 = solve(str);
        System.out.println(res);
    }
    public static boolean solve(String str){
        int l = 0;
        int r = str.length()-1;
        while(l < r){
            int mid = (l+r)/2;
            if(str.charAt(l) != str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static boolean solve1(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = str.length()-1; i >= 0 ; i--){
            sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());
        if(str.equals(sb.toString())){
            return true;
        }
        return false;
    }
}