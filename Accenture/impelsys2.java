import java.util.*;

public class impelsys2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 5;
        int b = 3;
        int count = 0;
        for(int i = 1 ; i <= a ; i++){
            for(int j = i ; j<= a ; j++){
                if(gcd(i,j) == b){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static int gcd(int a , int b){
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
}
