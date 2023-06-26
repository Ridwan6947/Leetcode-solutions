class Solution {
    public int diagonalPrime(int[][] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            list.add(nums[i][i]);
            list.add(nums[i][nums.length-i-1]);
        }
        Collections.sort(list,Collections.reverseOrder());
        for(int i=0;i<list.size();i++)
        {
            if(isprime(list.get(i)))return list.get(i);
        }
        return 0;
    }
    public static boolean isprime(int num)
    {
        if(num<2)return false;
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0)return false;
        }
        return true;
    }
}
