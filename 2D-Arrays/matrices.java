import java.util.*;
public class matrices{

    public static void largestElement(int matrix[][]){
        int element;
        int largestElement = Integer.MIN_VALUE;
        for(int i = 0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                element = matrix[i][j];
                largestElement = Math.max(element, largestElement);
            }
        }
        System.out.print("Largest element in given matrix is " + largestElement);
        
    }
    public static void smallestElement(int matrix[][]){
        int element;
        int smallestElement = Integer.MAX_VALUE;
        for(int i = 0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                element = matrix[i][j];
                smallestElement = Math.min(element, smallestElement);
            }
        }
        System.out.print("smallest element in given matrix is " + smallestElement);
        
    }
    public static void main(String [] args){
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        largestElement(matrix);
        System.out.println();
        smallestElement(matrix);

    }
}