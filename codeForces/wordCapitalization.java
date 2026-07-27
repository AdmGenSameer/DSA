
import java.util.*;
public class wordCapitalization{

    public static void firstLetterCapital(String str){
        int n = str.length();
        String capitalized = str.substring(0, 1).toUpperCase();
        String newString = capitalized + str.substring(1,n);
        System.out.print(newString);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        firstLetterCapital(str);

    }
}