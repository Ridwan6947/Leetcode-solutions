import java.util.*;

public class ibm4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 2;
        solve(n);
    }
    public static void solve(int n){
        ArrayList<Integer> list = new ArrayList<>();
        while(n > 0){
            list.add(n % 2);
            n = n / 2;
        }
        for(int i = list.size()-1 ; i >=0 ; i--){
            System.out.print(list.get(i));
        }
    }
}