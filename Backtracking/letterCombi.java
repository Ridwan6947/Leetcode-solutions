import java.util.*;


public class letterCombi {

    public static void find(String str , HashMap<Character,String>map , List<String>ans , int i , StringBuilder sb){
        if(i == str.length()){
            ans.add(sb.toString());
            return;
        }
        String curr = map.get(str.charAt(i));
        for(int k = 0 ; k < str.length() ; k++){
            sb.append(curr.charAt(k));
            find(str, map, ans, i+1, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        String str = "23";
        if(str.length() == 0){
            System.out.println(ans);
        }
        HashMap<Character, String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        find(str,map,ans,0,new StringBuilder());
        System.out.print(ans);
    }
}
