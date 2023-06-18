import java.util.*;

public class compileTime {
    public static void main(String[] args) {
        compileTime demo = new compileTime();
        System.out.println(demo.add(2,3));
        System.out.println(demo.add(2,3,4));
        // System.out.println(demo.add(2.5,4.5));
    }
    public static int add(int x , int y){
        return x+y;
    }
    public static int add (int x , int y , int z){
        return x+y+z;
    }
    // public static int add(float x , float y){
    //     return  (int) (x+y);
    // }
}
