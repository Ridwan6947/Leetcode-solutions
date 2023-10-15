import java.util.*;

public class ibmdream {
    public static void main(String[] args) {
        String str = "This is Form16 submis$ion date";
        int ans = count(str);
        System.out.println(ans);
    }
    public static int count(String str){
        String[] arr = str.split("\\s+");
        String vowel = "[aeiouAEIOU]";
        String consonent = "[a-zA-Z&&[^aeiouAEIOU]]";
        // String special = "[!@#$%^&*]";
        int count = 0;
        for(String word : arr){
            if(word.length() >= 3 && word.matches(".*" + vowel + ".*") && word.matches(".*" + consonent + ".*") &&word.matches("^[0-9A-Za-z]*$")){
                count++;
            }
        }
        return count;

    }
}
