import java.util.*;

public class oddEvenarray {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int [] arr ={3,4,1,7,9};
        // for(int i = 0 ; i < arr.length ; i++){
        //     arr[i] = sc.nextInt();
        // }
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(i % 2 == 0){
                even.add(arr[i]);
            }else{
                odd.add(arr[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        System.out.println("Even array :");
        for(int i : even){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("odd array :");
        for(int i : odd){
            System.out.print(i + " ");
        }
    }
}
