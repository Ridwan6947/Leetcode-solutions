public class singleLevel {
    public static void main(String[] args) {
        executive e1 = new executive();
        System.out.println("salary:" + e1.salary);
        System.out.println("bonus:" + e1.bonus);
    }
}
class employee{
    int salary = 50000*12;
}
class executive extends employee{
    int bonus = 3000*4; 
}