public class checkDiff {
    public static void main(String[] args) {
        int [] arr ={12,3,14,56,77,13,13,12};
        int num = 13;
        int diff = 2;
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(Math.abs(arr[i] - num) <= diff ){
                count++;
            }
        }
        System.out.println(count);

    }
}
