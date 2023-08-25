import java.util.*;

public class stringss {

    // substring and equals
    public static boolean check(String str){
        int size = str.length();
        if(size == 0 || size == 1){
            return true;
        }
        String f = str.substring(0, 1);
        String l = str.substring(size-1);
        if(f.equals(l)){
            return check(str.substring(1, size-1));
        }
        return false;
    }
    public static void check(String str, String str1){
        if(str.contains(str1)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        boolean res = check(str);
        System.out.println(res);
        check(str,str1);
    }
}
