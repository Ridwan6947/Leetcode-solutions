import java.util.*;

public class cisco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = "hellofromtheotherside";
        String pattern = "##o#";
        scanner.close();
        
        int uniqueNumber = findUniqueNumber(inputString, pattern);
        System.out.println(uniqueNumber);
    }

    public static int findUniqueNumber(String input_String, String pattern) {
        int uniqueNumber = 0;
        int patternLength = pattern.length();

        for (int i = 0; i <= input_String.length() - patternLength; i++) {
            boolean match = true;
            for (int j = 0; j < patternLength; j++) {
                if (pattern.charAt(j) != '#' && pattern.charAt(j) != input_String.charAt(i + j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                uniqueNumber = uniqueNumber * 10 + (i + 1);
            }
        }

        return uniqueNumber;
    }
}
