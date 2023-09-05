
public class oops {
    public static void main(String[] args) {                                            //this whole code is encapsulated in different classes
        Car car=new Car(4, "Red", true);
        System.out.println(car.color);
        Bike bike=new Bike(2, "Black", false);
        System.out.println(bike.color);
    }
    
}
abstract class Vehical{
    protected int wheels;
    protected void horn(boolean isWorking){
        if(isWorking){
            System.out.println("Honk");
        }
        else{                                                                      //this case is showing abstraction 
            System.out.println("Horn is not working");                           
        }
    }
    String color;
}
class Car extends Vehical{
                                                                                    // this is showing inheritance
    Car(int wheels,String color,boolean isWorking){
        this.wheels=wheels;
        this.color=color;
        horn(isWorking);
    }
}
class Bike extends Vehical{
    protected void horn(boolean isWorking){
        if(isWorking){
            System.out.println("beep");
        }
        else{                                                                      //this is showing polymorphism
            System.out.println("Horn is not working");
        }
    }
    Bike(int wheels,String color,boolean isWorking){
        this.wheels=wheels;
        this.color=color;
        horn(isWorking);
    }
}
