import java.util.*;
import java.util.ArrayList;
public class merc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int k = 1;
        int num = 2;
        int size =0;
        ArrayList<Integer> list = new ArrayList<>();
        while(list.size() != n){
            if(isPrime(num) && num % 10 == k){

            }
        }
        for(int i = 0 ; i < list.size() ; i++){
            System.out.print(list.get(i) + " ");
        }
    }
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        if(num == 2){
            return true;
        }
        if(num % 2 == 0){
            return false;
        }
        for(int i = 3 ; i < num / 2 ; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
