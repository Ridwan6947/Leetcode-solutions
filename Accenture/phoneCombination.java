import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class phoneCombination {
    // Function to find a list of all words possible by pressing given numbers.
    static ArrayList<String> possibleWords(int a[], int N) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        if (N == 0) {
            return (ArrayList<String>) ans;
        }
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        helper(ans, map, sb, 0, a);
        return (ArrayList<String>) ans;
    }

    public static void helper(List<String> ans, HashMap<Integer, String> map, StringBuilder sb, int i, int[] a) {
        if (i == a.length) {
            ans.add(sb.toString());
            return;
        }
        String curr = map.get(a[i]);
        for (int k = 0; k < curr.length(); k++) {
            sb.append(curr.charAt(k));
            helper(ans, map, sb, i + 1, a);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 4};
        ArrayList<String> result = possibleWords(a, 3);
        for (String word : result) {
            System.out.println(word);
        }
    }
}

