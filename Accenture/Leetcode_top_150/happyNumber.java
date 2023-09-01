import java.util.*;
// Code for happyNumber
public class happyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 19;
        boolean res = solve(n);
        System.out.println(res);
    }
    public static boolean solve(int n){
        HashSet<Integer> set = new HashSet<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            int sum = 0;
            while(n!= 0){
                int digit = n % 10;
                sum += digit * digit;
                n = n/ 10;

                n = sum;
            }
        }
        if(n == 1){
            return true;
        }
        return false;
    }
}

