import java.util.*;

public class uniqueFrequency {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,3};
        boolean ans = uniqueOccurrences(arr);
    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        HashSet<Integer> set = new HashSet<>(map.values());
        if(map.size() == set.size()){
            return true;
        }
        return false;
    }
}
