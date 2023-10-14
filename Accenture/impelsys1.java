import java.util.*;

public class impelsys1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abaab";
        int []occ = new int[str.length()];
        for(int i = 0 ; i < str.length() ; i++){
            char c = str.charAt(i);
            int count = 0;
            for(int j = i+1 ; j < str.length() ; j++){
                if(str.charAt(j) ==c){
                    count++;
                }
            }
            occ[i] = count;
        }
        for(int i = 0 ; i < occ.length ; i++){
            System.out.print(occ[i] + " ");
        }
    } 
}
