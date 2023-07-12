class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
       boolean[]isPrime = new boolean[n+1];
       isPrime[0] = true;
       isPrime[1] = true;

       for(int i = 2 ; i*i <= n ; i++){
           if(isPrime[i] == false){
               for(int j = i*i ; j <= n ; j+=i){
                   isPrime[j] = true;
               }
           }
       }
       List<List<Integer>> ans = new ArrayList<>();
       for(int i = 2 ; i <= n/2 ; i++){
           if(isPrime[i] == false && isPrime[n-i] == false){
               List<Integer>li = new ArrayList<>();
               li.add(i);
               li.add(n-i);
               ans.add(new ArrayList(li));
           }
       }
       return ans;
    }
}
