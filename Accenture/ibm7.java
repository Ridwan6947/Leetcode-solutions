import java.util.*;

public class ibm7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 20;
        for(int i = 1 ; i <= n ; i++){
            if(check(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean check(int n){
        if(n == 0 || n == 1){
            return false;
        }
        for(int i = 2 ; i * i <= n ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
