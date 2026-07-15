package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch { // Class name should start with uppercase

    public static void Search(String menu[], String key) { // Fixed method signature
        boolean found = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(key)) { // Case-insensitive search
                System.out.println("Customer wants " + key + " at index " + i);
                found = true;
                break; // Stop after finding the first match
            }
        }
        if (!found) {
            System.out.println("Option is not available in menu.");
        }
    }

    public static void main(String[] args) {
        String menu[] = {"samosa","kachori","aloobada","burger","pizza","fries","coldrink","icecream","cake","chocolate","donut","muffin","pasta","noodles","sandwich","wraps","tacos","burrito","nachos","quesadilla"};
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.toString(menu));
        System.out.println("Enter what do you want?");
        String key = sc.next();
        Search(menu, key);
        sc.close();
    }
}
