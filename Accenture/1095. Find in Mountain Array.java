/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int len = mountainArr.length();
        int left = 0;
        int right = len-1;
        while(left < right){
            int mid = (left+right)/2;
            int midVal = mountainArr.get(mid);
            int midValNext = mountainArr.get(mid+1);
            if(midVal <  midValNext){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        int peak = left;
        int leftRes = binary(mountainArr,target,0,peak,true);
        if (leftRes != -1) {
            return leftRes;
        }
        int rightResult = binary(mountainArr, target, peak, mountainArr.length() - 1, false);
        return rightResult;
    }
    private int binary(MountainArray mountainArr, int target, int left, int right, boolean ascending) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = mountainArr.get(mid);
            if (midValue == target) {
                return mid;
            } 
            if (ascending) {
                if (midValue < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (midValue < target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}