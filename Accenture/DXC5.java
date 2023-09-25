import java.util.*;

public class DXC5 {
    public static void main(String[] args) {
        String str = "ghygbvghyghnhjuhjumnj";
        int ans = solve(str);
        int ans2 = solve2(str);
        System.out.println(ans);
        System.out.println(ans2);
    }
    public static int solve(String str){
        int ans =0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                ans++;
            }
        }
        return ans;
    }
    public static int solve2(String str){
        int ans = 0;
        int arr[] = new int [26];
        char[] c = str.toCharArray();
        for(int i = 0 ; i < c.length ; i++){
            arr[c[i] - 'a']++;
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 1){
                ans++;
            }
        }
        return ans;

    }
}
