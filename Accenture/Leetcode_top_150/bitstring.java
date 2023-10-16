import java.util.*;

public class bitstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "1C0C1C1A0B1";
        int res = str.charAt(0) - '0';
        for (int i = 1; i < str.length ();){
            char prev = str.charAt (i);
	        i++;
	        if (prev == 'A')
	        res = res & (str.charAt (i) - '0');
	        else if (prev == 'B')
	        res = res | (str.charAt (i) - '0');
	        else
	        res = res ^ (str.charAt (i) - '0');
	        i++;
        }
        System.out.println(res);
    }
}
