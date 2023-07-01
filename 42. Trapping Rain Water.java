class Solution {
    public int trap(int[] height) {
        if(height==null) return 0;
        int l=0,r=height.length-1,lmax=height[l],rmax=height[r],water=0;
        while(l<r){
            if(lmax<rmax){
                l+=1;
                lmax = Math.max(lmax,height[l]);
                water +=lmax-height[l];
            }else{
                r-=1;
                rmax = Math.max(rmax,height[r]);
                water+=rmax-height[r];
            }
        }
        return water;
    }
}
