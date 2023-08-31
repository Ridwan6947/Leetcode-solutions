import java.util.*;

public class checkcharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "xyzabdcfgg";
        char [] arr = str.toCharArray();
        Arrays.sort(arr);
        // System.out.println(String.valueOf(arr));
        char [] chara = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(int i = 0 ; i < arr.length ;){
            char c1 = arr[i];
            char c2 = chara[i];
            System.out.println(c1 + " " + c2);
            if(c1 == c2){
                i++;
            }else{
                System.out.println(c2);
                break;
            }
        }


    }
}
