import java.util.*;

public class decTonBase {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int n = 21;
        int num = 5678;
        String ans = "";
        int quotient = num / n;
        ArrayList <Integer> list = new ArrayList<>();
        list.add(num % n);
        while(quotient != 0){
            list.add(quotient % n);
            quotient = quotient/n;
        }
        for(int i = 0 ; i < list.size() ; i++){
            if(list.get(i) > 9){
                ans = (char) (list.get (i) - 9 + 64) + ans;
            }else{
                ans = list.get(i) + ans;
            }
        }
        System.out.println(ans);

    }
}
