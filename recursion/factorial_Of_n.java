import java.util.*;
public class factorial_Of_n {

    public static int  print(int n){
    if(n == 0){
        return 1;
    }
    int nm1 = print(n-1);
    int n1 = n * nm1;
    return n1;
    
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(print(n));
    }
}
