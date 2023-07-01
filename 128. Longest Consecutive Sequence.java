class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        PriorityQueue<Integer>q = new PriorityQueue<>();
        for(int num : nums){
            q.add(num);
        }
        int prev = q.poll();
        int max = 1;
        int cmax = 1;
        while(q.isEmpty()==false){
            // System.out.print(q.poll());
            int x = q.poll();
            if(x-1 == prev){
                cmax++;
                prev=x;
            }else if(x==prev)
                prev=x;

            else
            {
                cmax=1;
                prev=x;
            }
            max = Math.max(max,cmax);
        }
        return max;
    }
}
