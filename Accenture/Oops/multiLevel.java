package Oops;
public class multiLevel {
    public static void main(String[] args) {
        animal a1 = new animal();
        dog d1 = new dog();
        puppy c1 = new puppy();
        
        a1.voice();
        d1.voice();
        c1.voice();

    }
}
class animal{
    void voice(){
        System.out.println("Animal voice");
    }
}
class dog extends animal{
    void voice(){
        System.out.println("Dog Barking");
    }
}
class puppy extends dog{
    void voice(){
        System.out.println("puppy meow");
    }
}
