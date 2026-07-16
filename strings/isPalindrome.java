package strings;
import java.util.Scanner;
public class isPalindrome {
    
    public static void isPalindromeOrNot(String str){
        int left = 0; // i assigned the str.charAt(left) 
        int right = str.length()-1;

        while(left<right){ // i used equat value of left and right, but correct way is when they cross each other then stop the process, because if they cross each other then it means we have checked all the characters and they are equal, so the string is a palindrome.
            if(str.charAt(left)==str.charAt(right)){
                left++;
                right--;
                
            }
            else{
                System.out.println("Given String is not a palindrome.");
                return;// i used return here because if the string is not a palindrome then we don't need to check further, we can stop the process, also if we don't use return then it will print "Given string is a palindrome" after printing "Given String is not a palindrome." which is not correct.before using return i used break but it was not correct because after break it will print "Given string is a palindrome" which is not correct.
            }
            
        }
        System.out.println("Given string is a palindrome");
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        isPalindromeOrNot(str);
        sc.close();
    }
    
}
