package Oops;
public class methodOverloading {
    public static void main(String[] args) {
        FindArea a1 = new FindArea();
        FindArea a2 = new FindArea();
        System.out.println(a1.area(5, 2));
        System.out.println(a2.area(5, 5, 5));
    }
}
class FindArea{
    public int area(int l , int b){
        return l * b;
    }
    public int area(int l , int b , int h){
        return l * b * h;
    }
}