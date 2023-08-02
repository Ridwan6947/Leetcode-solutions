import java.util.*;



public class validPass {
    public static int ans(String str){
        if(str.length() < 4){
            return 0;
        }
        int numCount = 0;
        int alphCount = 0;
        if(str.charAt(0) >= '0' && str.charAt(0) <='9'){
            return 0;
        }
        for(int i = 0 ; i < str.length() ; i++){
            char c = str.charAt(i);
            if(c > '1' && c < '9'){
                numCount++;
            }
            if(c >'A' && c < 'Z'){
                alphCount++;
            }
            if(c == ' ' || c == '/'){
                return 0;
            }

        }
        if (numCount > 0 && alphCount > 0)
        return 1;
        else
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = "a987abC012";
        int check = ans(pass);
        System.out.println(check);
    }
}
