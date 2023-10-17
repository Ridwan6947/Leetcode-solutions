public class o1 {
    public static void main(String[] args) {
        myName obj1 = new myName("Ridwan");
        System.out.println(obj1.name);

    }
}
class myName{
    String name;
    // String name1 = "Ridwan";

    myName(String name1){
        this.name = name1;
    }
}