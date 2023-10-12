import java.util.*;

public class ibm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "abcd";
        String str2 = "tdxy";
        HashSet<Character> set = new HashSet<>();
        for(char c : str1.toCharArray()){
            if(!set.contains(c)){
                set.add(c);
            }
        }
        for(char d : str2.toCharArray()){
            if(!set.contains(d)){
                set.add(d);
            }
        }
        int n = set.size();
        System.out.println(n);
    }
}
