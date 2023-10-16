public class hierercialLevel {
    public static void main(String[] args) {
        science s1 = new science();
        commerce c1 = new commerce();
        s1.scienceMethod();
        c1.commerceMethod();
    }
}
class student{
    void studentMethod(){
        System.out.println("Student Method called");
    }
}
class science extends student{
    void scienceMethod(){
        System.out.println("Science Method Called");
    }
}
class commerce extends student{
    void commerceMethod(){
        System.out.println("Commerce method called");
    }
}
