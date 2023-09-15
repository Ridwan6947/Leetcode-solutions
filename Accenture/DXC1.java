import java.util.*;
public class DXC1 {
    public static void main(String[] args) {
        int n = 3;
        int []state = {1,0,0};
        int []dis = {1,5,6};

        int cableLength = 0;
        int lastActive= -1;
        for(int i = 0 ; i < n ; i++){
            if(state[i] == 1){
                lastActive = i;
            }else{
                if(lastActive != -1){
                    cableLength += dis[i] - dis[lastActive];
                    lastActive = i;
                }
            }
        }
        System.out.println(cableLength);


    }
}
