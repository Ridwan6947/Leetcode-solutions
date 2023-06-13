import java.io.*;
import java.util.*;

public class Solution {
     public static boolean isPowerOfFour(int n)
    {
        if(n == 0)
        return true;
        while(n != 1)
        {
            if(n % 4 != 0)
            return false;
            n = n / 4;    
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Boolean ans = isPowerOfFour(n);
        System.out.println(ans);
}
}
