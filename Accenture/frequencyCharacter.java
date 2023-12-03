import java.util.*;


public class frequencyCharacter {
    public static void main(String[] args){
        String inputStr = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>(inputStr);
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
    public static HashMap<Character,Integer> map(String str){
        HashMap<Character,Integer> Freqmap = new HashMap<>();
        char[] arr = str.toCharArray();
        for(char c : arr){
            Freqmap.put(c,Freqmap.getOrDefault(c,0)+1);
        } 
        return Freqmap;
    }
}
