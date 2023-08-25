import java.util.*;

public class factorialKnapSack{
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int [] val = new int[n];
        // for(int i = 0 ; i < val.length ; i++){
        //     val[i] = sc.nextInt();
        // }
        // int [] weight = new int[n];
        // for(int i = 0 ; i < weight.length ; i++){
        //     weight[i] = sc.nextInt();
        // }
        // int W = sc.nextInt();
        int [] val = {60,100,120};
        int [] weight = {10,20,30};
        int W = 50;
        double [][] ratio = new double[val.length][2];
        for(int i = 0 ; i < val.length ; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double)weight[i];
        }
        int maxValue = 0;
        int totalWeight = W;
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));
        for(int i = ratio.length-1 ; i >= 0 ; i--){
            int index = (int)ratio[i][0];
            if(totalWeight >= weight[index]){
                maxValue += val[index];
                totalWeight -= weight[index];
            }else{
                maxValue += (ratio[i][1] * totalWeight);
                totalWeight = 0;
                break;
            }
        }
        System.out.print(maxValue);
    }
}