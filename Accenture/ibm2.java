import java.util.*;
//HCF Finder
public class ibm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 70;
        int m = 15;
        int ans = calc(n,m);
        System.out.println(ans); 
    }
    public static int calc(int n , int m){
        int ans = 0;
        for(int i = 1 ; i < n || i < m ; i++){
            if(n % i == 0 &&  m % i == 0){
                ans = i;
            }
        }
        return ans;
    }
}

