class Solution {
    public int largestRectangleArea(int[] a) {
        int ans =0;
        int right=0;
        int left=0;
        for(int i =0;i<a.length;i++)
        {
            for(int j =i;j<a.length;j++)
            {
                if(a[j]>=a[i])
                    right++;
                else
                    break;
            }
            for(int j =i;j>=0;j--)
            {
                if(a[j]>=a[i])
                    left++;
                else
                    break;
            }
            int area = (left+right-1)*a[i];
            if(area>ans)
                ans=area;
            left=0;
            right=0;
        }
        return ans;
    }
}
