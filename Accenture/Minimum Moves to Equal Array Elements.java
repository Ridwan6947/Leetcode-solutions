import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 0;
        int mid = arr.length/2;
        for(int i = 0; i<arr.length; i++){
            count += Math.abs(arr[mid] - arr[i]);
        }
        System.out.println(count);
    }
}