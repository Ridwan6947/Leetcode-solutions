import java.util.*;
public class inttoroman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Map<Character,Integer> map = new HashMap<>(); 
        map.put('I' , 1);
        map.put('V' , 5);
        map.put('X' , 10);
        map.put('L' , 50);
        map.put('C' , 100);
        map.put('D' , 500);
        map.put('M' , 1000);

        int sum = 0;
        int prev = 0;
        int curr = 0;
        for(int i = str.length()-1 ; i >= 0 ; i--){
            char c = str.charAt(i);
            curr = map.get(c);
            if(prev > curr){
                sum -= curr;
            }else{
                sum += curr;
            }
            prev = curr;
        }
        System.out.println(sum);



    }
}
