import java.util.*;


public class numssubset {

    public static void sub(int i , int []nums , List<Integer>subset ,  List<List<Integer>>result){
        if(i >= nums.length ){
            result.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        sub(i+1,nums,subset,result);
        subset.remove(subset.size() - 1);
        sub(i+1,nums,subset,result);
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        List<List<Integer>>result =new ArrayList<>();
        sub(0,nums,new ArrayList<>(),result);
        System.out.print(result);
    }    
}
