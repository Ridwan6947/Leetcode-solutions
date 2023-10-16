package Oops;
import java.util.*;

public class oops2 {
    public static void main(String[] args) {
        shape s1 = new circle("red",2);

    }
}
abstract class shape{
    String color;
    double area;
    
    shape(){
        this.color = color;
    }
} 
class circle extends shape{
    double radius;
    circle(String color){
        this.color = color;
    }
    @Override double area(){
        return  Math.PI * Math.pow(radius, 2);
    }
    
}
