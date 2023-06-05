import java.io.*;
import java.util.*;
// ridwan
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = count(n);
        System.out.println(ans);
    }
    public static int count(int n ){
        int a=1,e=1,i=1,o=1,u=1;
        for(int k=1;k<n;k++){
            a=a+e+i+o+u;
            e=e+i+o+u;
            i=i+o+u;
            o=o+u;
        }
        return a+e+i+o+u;
    }
}