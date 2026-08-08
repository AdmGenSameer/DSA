package codeForces;
import java.util.*;
public class petyaStrings {

    public static void getString(String str1, String str2){
        String newStr1 = str1.toLowerCase();
        String newStr2 = str2.toLowerCase();
        int value = 0;

        
            for (int i = 0; i < newStr1.length(); i++) {
                int n = newStr1.charAt(i) - '0';
                int m = newStr2.charAt(i) - '0';
                if(n>m){
                    value = 1;
                    break;
                }
                else if(n<m){
                    value = -1;
                    break;
                }
                else{
                    value = 0;
                }
            
        }
        
        System.out.println(value);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        getString(str1, str2);
        sc.close();

    }
}
