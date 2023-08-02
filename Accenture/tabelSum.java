import java.util.*;

public class tabelSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int sum = 0;
        int ans[] = new int [11];
        for(int i = 1 ; i <= 10 ; i++){
            ans[i] = n * i;
            sum += ans[i];

        }
        for(int i = 0 ; i < ans.length ; i++ ){
            System.out.print(ans[i]+ " ,");
        }
        System.out.println(sum);
    }
}
