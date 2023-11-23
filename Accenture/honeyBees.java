import java.util.*;

public class honeyBees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 2;
        int[] bees = {5,10};
        int[] flower = {20,4};
        Arrays.sort(array);
 
        // Reversing the array
        reverse(array);
 
        // Printing the elements
        System.out.println(Arrays.toString(array));
    }
 
    public static void reverse(int[] array)
    {
 
        // Length of the array
        int n = array.length;
 
        // Swapping the first half elements with last half
        // elements
        for (int i = 0; i < n / 2; i++) {
 
            // Storing the first half elements temporarily
            int temp = array[i];
 
            // Assigning the first half to the last half
            array[i] = array[n - i - 1];
 
            // Assigning the last half to the first half
            array[n - i - 1] = temp;
        }




        
    }
}
