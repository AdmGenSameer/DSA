// You are using Java
import java.util.*;

public class Main{
    
    public static int method(String str){
        
        int hash = 0;
        int star = 0;
        int count = 0;
        
        
        for(int i = 0; i<str.length();i++){
            
            if(str.charAt(i)=='#'){
                hash++;
            }
            else{
                star++;
            }
        }
        
        if(star>hash){
            count = star - hash;
        }
        else if(star<hash){
            count = star - hash;
        }
        else{
            count = 0;
        }
        
        return count;
        
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(method(str));
        sc.close();
    }
}