import java.util.*;

public class UBS3 {

    public static void main(String[] args) {
        List<String> subjects = new ArrayList<>();
        List<String> spam_words = new ArrayList<>();
        subjects.add("gwnpnzijd gwnpnzijd gwnpnzijd gwnpnzijd gwnpnzijd gwnpnzijd gwnpnzijd gwnpnzijd gwnpnzijd");
        subjects.add("gwnzijd gwnpnzijd gwnpnzijd gwnpnzijd gwnpnzijd gwnzijd gwnpnzijd gwnzijd gwnpnzijd");
        subjects.add("algovldafzaor hdigyojknvi ztpmxlvovah phshyfiqqtabxjj qngqjhwkcexec dkmzakbzrkjwady");
        subjects.add("gwnzijd gwnpnzijd gwnpnzijd gwnpnzijd gwnpnzijd gwnpnzijd gwnpnzijd gwnpnzijd gwnpnzijd\r\n" + //
                "ssjoatrymbwxtai");
        subjects.add("xnagmayz fnzpqftobtaotua xmwvzllkujidh kzwzeltgangguft ahalwvjwqncksiz");
        subjects.add("gwnzijd gwnpnzijd gwnpnzijd gwnpnzijd gwnpnzijd gwnpnzijd gwnpnzijd gwnpnzijd");

        spam_words.add("gpuamkxkszhkbpph");
        spam_words.add("kinkezplvfjaq");
        spam_words.add("opodo");
        spam_words.add("krjz");
        spam_words.add("imlvumuare");
        spam_words.add("excfyc");
        spam_words.add("beurg");
        spam_words.add("jyos");
        spam_words.add("dhvuyfvtvn");
        spam_words.add("dyluacvray");
        spam_words.add("gwnpnzijd");

        List<String> ans = solve(subjects, spam_words);
        for (String result : ans) {
            System.out.println(result);
        }
    }

    public static List<String> solve(List<String> subjects, List<String> spam_words) {
        List<String> ans = new ArrayList<>();

        for (String str : subjects) {
            List<String> words = Arrays.asList(str.toLowerCase().split("\\s+"));
            Set<String> uniqueSpamWords = new HashSet<>(words);
            uniqueSpamWords.retainAll(spam_words);

            if (!uniqueSpamWords.isEmpty()) {
                ans.add("spam");
            } else {
                ans.add("not_spam");
            }
        }
        return ans;
    }
}
