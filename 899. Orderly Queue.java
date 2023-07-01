class Solution {
    public String orderlyQueue(String s, int k) {
        char[] arr = s.toCharArray();
        if(k > 1){
            Arrays.sort(arr);
            return String.valueOf(arr);
        }
        String ans = s;
        for(int i = 0 ; i < s.length() ; i++){
            rotatestr(arr);
            int d = ans.compareTo(String.valueOf(arr));
            if(d > 0){
            ans = String.valueOf(arr);
            }
        }
        return ans;
    }
        public void rotatestr(char[] arr){
        char t = arr[0];
        for(int i = 0 ; i < arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = t;
    }
}
