import java.util.*;

public class removeDuplicatesInString {
    public static void main(String[] args) {
        String str = "aabbccddefgh";
        int n = str.length();
        String ans = helper(str,n);
        System.out.println(ans);
    }
    public static String helper(String str,int n){
        char[] arr = str.toCharArray();
        int index = 0;
        for(int i = 0 ; i < str.length() ; i++){
            int j;
            for(j = 0 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    break;
                }
            }
            if(j == i){
                arr[index++] = arr[i];
            }
        }
        return String.valueOf(Arrays.copyOf(arr,index));
    }
}
