class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int left = 0;
        int right = height.length-1;

        while(left < right){
            if(height[left] < height[right]){
                area = Math.max(area,height[left] *(right-left));
                left++;
            }else{
                area = Math.max(area ,height[right]*(right-left));
                right--;
            }
        }
        return area;
    }
}
