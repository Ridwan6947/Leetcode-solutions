import java.util.*;

public class calcSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ll = sc.nextInt();
        int ul = sc.nextInt();
        int sum = 0;
        for(int i = ll ; i <= ul ; i++){
            if(i % 3 == 0 && i % 5 == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);

    }
}
