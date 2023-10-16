public class findPeek {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        int ans = findPeakElement(arr);
        System.out.println(ans);
    }
    public static  int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int ans = 0;
        while(low < high){
            int mid = (low+high)/2;
            System.out.print(mid);
            if(nums[mid] > nums[mid+1]){
                high= mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}
