import java.util.*;

public class DXC6 {
    public static void main(String[] args) {
        int itemID = 723894;
        int ans = solve(itemID);
        System.out.println(ans);
    }
    public static int solve(int itemID){
        int maxDigit = 0;
        while(itemID > 0){
            int digit = itemID % 10;
            maxDigit = Math.max(maxDigit , digit);
            itemID = itemID / 10;
        }
        return maxDigit;
    }
}
