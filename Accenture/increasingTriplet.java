public class increasingTriplet {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        boolean ans = solve(arr);
        System.out.println(ans);
    }
    public static boolean solve(int[] ans){
        int min1 = Integer.MAX_VALUE;
        int mins2 = Integer.MAX_VALUE;
        for(int i : ans){
            if(i < min1) min1 = i;
            else if(i > min1 && i <= mins2) mins2 = i;
            else return true;
        }
        return false;
    }
}
