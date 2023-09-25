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
        int ans = 0;
        int t1 = distance/s1;
        int t2 = distance/s2;
        int t3 = distance/s3;
        ans = Math.min(Math.min(t1,t2),t3);
        return ans;
    }
}
