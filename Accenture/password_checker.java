import java.util.*;

public class password_checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Geek$ForGeeks7";
        boolean ans = valid(str);
        System.out.println(ans);
    }
    public static boolean valid(String str){
        boolean ans = true;
        int numeric_count = 0;
        int len = str.length();
        int lowerCase = 0;
        int upperCase = 0;
        int special = 0;
        if(!((str.length() >= 8 )&& (str.length() <= 15))){
            return false;
        }
        for(int i = 0 ; i < len ; i++){
            char c = str.charAt(i);
            if(c == ' '){
                return false;
            }
            if(c >= '1' && c <= '9'){
                numeric_count++;
            }
            if(c >= 'a' && c <= 'z'){
                lowerCase++;
            }
            if(c >= 'A' && c <= 'Z'){
                upperCase++;
            }
            if(c == '~' || c == '!'|| c == '@'|| c == '#'|| c == '$'|| c == '%'|| c == '^'|| c == '&'|| c == '*'|| c == '('|| c == ')'|| c == '-'|| c == '+'|| c == '/'|| c == ':'|| c == '.'|| c == ','|| c == '<'|| c == '>'|| c == '?'|| c == '|'){
                special++;
            }
        }
        if(numeric_count > 0 && lowerCase > 0 && upperCase > 0 && special > 0){
            return true;
        }
        return false;
    }
}
