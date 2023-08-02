import java.util.*;

public class ratfood{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int unit = sc.nextInt();
        int []arr = {2,8,3,5,7,4,1,2};
        int totalFood = r * unit;
        int houseFood = 0;
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(totalFood > houseFood){
                houseFood += arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}