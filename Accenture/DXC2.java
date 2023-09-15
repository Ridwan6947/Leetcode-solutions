public class DXC2 {
    public static void main(String[] args){
        int s1 = 10;
        int s2 = 12;
        int s3 = 15;
        String ans = solve(s1,s2,s3);
        System.out.println(ans);
    }
    public static String solve(int s1,int s2,int s3){
        if(s1  < s2){
            return "Good";
        }else if(s1 >= s2 && s1 <= s3){
            return "Can do better";
        }else{
            return "best";
        }
    }
}
