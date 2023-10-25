import java.util.*;
public class singleNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2};
        int ans =singleNumber(arr);
        System.out.println(ans);
    }
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        int ans = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
        }
    }
