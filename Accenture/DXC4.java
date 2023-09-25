import java.util.*;

public class DXC4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int message = 4;
        int key1 = 5;
        int key2 = 1;
        long ans = solve(message,key1,key2);
        System.out.println(ans);
    }
    public static long solve(int message , int key1 , int key2){
        long ans = 0;
        ans = (long) Math.pow(Math.pow(message, key2) % 5, key1) % 7000000001L;
        return ans;
    }
}
