import java.util.Arrays;
import java.util.Scanner;

public class boyOrGirl{

    public static void chatStatus(String str){
        char [] strArray = str.toCharArray();
        Arrays.sort(strArray); // Sorts strArray directly in-place
        int count = 1;
        for(int i = 1; i<strArray.length; i++){
            if(strArray[i] != strArray[i-1] ){
                count++;
            }
        }

        if(count%2==0){
            System.out.print("CHAT WITH HER!");
        }
        else{
            System.out.print("IGNORE HIM!");
        }

    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        chatStatus(str);
    }
}
// This question is also done with using HashSet, but I have used Arrays.sort() method to sort the array and then count the number of unique characters in the string. HashSet does not allow duplicate values, so we can add all the characters of the string to a HashSet and then check the size of the HashSet to get the number of unique characters. If the size is even, we print "CHAT WITH HER", otherwise we print "IGNORE HIM!".