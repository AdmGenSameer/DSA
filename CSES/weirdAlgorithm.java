
import java.util.Scanner;

public class weirdAlgorithm {
    public static void reduceToOne(long n ){
        System.out.print(n + " "); // Prlong initial value
        while(n != 1){
            if(n % 2 == 0){
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
            System.out.print(n + " "); // Prlong after each update
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        reduceToOne(n);
        sc.close();
    }
}
