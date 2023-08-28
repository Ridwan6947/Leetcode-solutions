import java.util.*;

public class groupAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] arr = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans = new ArrayList<>();
        solve(ans,arr);
        System.out.println(ans);
    }
    public static List<List<String>> solve(List<List<String>> ans , String[] arr){
        HashMap<String,List<String>> map = new HashMap<>();
        for(String i : arr){
            char [] a1 = i.toCharArray();
            Arrays.sort(a1);
            String str = new String(a1);

            if(!map.containsKey(str)){
                map.put(str,new ArrayList<>());
            }
            map.get(str).add(i);
        }
        ans.addAll(map.values());
        return ans;
    }
}
