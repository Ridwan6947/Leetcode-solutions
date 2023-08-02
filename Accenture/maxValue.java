import java.util.*;

public class maxValue {
    public static void main(String[] args) {
        int arr[] = {23,45,82,27,109,12,78,13,71,86};
        int max = arr[0];
        int index = 0;
        for(int i = 1 ; i < arr.length ; i++){
            if(max <  arr[i]){
                max = arr[i];
                index = i;
            }
            
        }
        System.out.println(max + " " + index);
    }
}
