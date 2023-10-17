package Oops;

public class constructor {
    public static void main(String[] args) {
        myName obj1 = new myName();
        System.out.println(obj1.name);
    } 
}
class myName{
    String name;

    myName(){
        name = "Ridwan";
    }
}
