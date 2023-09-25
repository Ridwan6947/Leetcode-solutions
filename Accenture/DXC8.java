import java.util.*;

public class DXC8 {
    public static void main(String[] args) {
        int[] arr =  {3,2,5,8,1,6,9,4};
        int[] rearrangedArr = rearrangeEvenOdd(arr);
        for (int num : rearrangedArr) {
            System.out.print(num + " ");
        }
    }
    public static int[] rearrangeEvenOdd(int[] arr) {
        int n = arr.length;
        int[] rearrangedArr = new int[n];
        int evenIndex = 0;
        int oddIndex = n - 1;
        for (int num : arr) {
            if (num % 2 == 0) {
                rearrangedArr[evenIndex] = num;
                evenIndex++;
            } else {
                rearrangedArr[oddIndex] = num;
                --oddIndex;
            }
        }
        return rearrangedArr;
    }
}
