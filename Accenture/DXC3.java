import java.util.*;

public class DXC3 {
    public static void main(String[] args) {
        int distance = 72;
        int s1 = 8;
        int s2 = 4;
        int s3 = 6;
        int ans = solve(distance,s1,s2,s3);
        System.out.println(ans);  
    }
    public static int solve(int distance , int s1 , int s2 , int s3){
        int a = distance / s1;
        int b = distance / s2;
        int c = distance / s3;

        int ans = (Math.min(Math.min(a,b),c));
        return ans;
    }
}
