import java.util.*;

public class delloit2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < list.size() ; i++){
            ans.add(list.get(i) * list.get(i));
        }
        ans.stream().forEach(number -> System.out.print(number + " "));

    }
}

