import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < str.length() ; i++){
            char c = str.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            }else{
                map.put(c,map.get(c)+1);
            }
        }
        int count = 0;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                count++;
            }
        }
        System.out.println(count);
    }
}
