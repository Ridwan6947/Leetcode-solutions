

abstract class Bike {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    abstract void print();
}

class Splendor extends Bike {
    // Implementation of the abstract method
    void print() {
        System.out.println("Splendor model: " + getName());
    }
}

public class oopsConcept {
    public static void main(String[] args) {
        Bike s1 = new Splendor();
        s1.setName("Passion Pro");
        s1.print();
    }
}

