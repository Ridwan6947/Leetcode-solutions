package Oops;
class Bike{  
    public void run(){
        System.out.println("running");
    }  
}  
class Splendor extends Bike{
    public void run(){
        System.out.println("running safely with 60km");
    }
}  
public class runTime{
    public static void main(String[] args){  
        Bike b = new Bike();//upcasting  
        b.run();  
    }  
}
