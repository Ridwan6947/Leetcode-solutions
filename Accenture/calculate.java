import java.util.*;

public class calculate {

    public static int calc(int a , int b , int c){
        int ans = 0;
        switch(c){
            case 1:
            ans = a + b;
            break;
            case 2:
            ans = a - b;
            break;
            case 3:
            ans = a * b;
            break;
            case 4:
            ans = a / b;
            break;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int res = calc(a,b,c);
        System.out.println(res);
    }

}
