import java.util.*;

public class maxFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int a = Integer.parseInt(n);
        String[] arr = new String[a];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextLine();
        }
        for(String s : arr){
            HashMap<Character,Integer>map = new HashMap<>();
            for(int j = 0 ; j < s.length() ; j++){
                char ch = s.charAt(j);
                if(!map.containsKey(ch)){
                    map.put(ch,1);
                }else{
                    map.put(ch,map.get(ch)+1);
                }
            }
            Set<Integer> frequencySet = new HashSet<>(map.values());
            if (frequencySet.size() == 1) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}
