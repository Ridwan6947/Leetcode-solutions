import java.util.*;

public class generateCarry {

    public static int carry(int num1, int num2){
        int carry = 0;
        int count = 0;
        int p = 0;
        int q = 0;
        while(num1 != 0 && num2 != 0){
            p = num1/10;
            q = num2/10;
            carry = carry + p + q;
            if(carry > 9){
                count++;
            }else{
                num1 = num1 % 10;
                num2 = num2 % 10;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 451;
        int num2 = 349;
        int ans = carry(num1,num2);
        System.out.println(ans);
    }
}
