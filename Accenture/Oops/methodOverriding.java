package Oops;

public class methodOverriding {
    public static void main(String[] args) {
        human a = new athlete();
        human a1 = new human();
        System.out.println(a.Speed(10, 5) + "m/s");
        System.out.println(a1.Speed(10, 5) + "m/s");
    }
}
class human{
    public int Speed(int distance , int time){
        int speed = distance / time;
        return speed;
    }
}
class athlete extends human{
    public int Speed(int distance , int time){
        int speed = distance / time;
        speed = speed * 2;
        return speed;
    }
}