import java.util.*;

public class palindrome {
    public static int palin(int i){
        int temp = i;
        int rem = 0;
        while(temp != 0){
            int rev = temp % 10;
            rem = (rem * 10) + rev;
            temp = temp / 10; 
        }
        return rem;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ll = sc.nextInt();
        int ul = sc.nextInt();
        // ArrayList<Integer> list = new ArrayList<>();
        for(int i = ll ;  i < ul ; i++){
            if(i == palin(i)){
                System.out.println(i);
            }
        }
        // while(!list.isEmpty()){
        //     for(int i = 0 ; i < list.size() ; i++){
        //         System.out.println(list.get(i));
        //     }
        // }

    }
}
