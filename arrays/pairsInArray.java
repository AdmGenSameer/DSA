package arrays;
public class pairsInArray{
    public  static void generatePairs(int nums[]){
        int tp =0;
        for(int i = 0; i<nums.length-1;i++){
                int numHead = nums[i];
                System.out.println("");
            for(int j = i+1; j<nums.length;j++){
                int numPair = nums[j];
                System.out.print("("+ numHead + "," + numPair + ")" );
                tp++;
            }
        }
        System.out.println("Total Pairs" + tp);
    }

    public static void main(String[] args) {
        int [] nums = {2,4,6,8,10};

        generatePairs(nums);
    }
    
}

// It was written By me , by my own logic
// Concept used - Nested Loops
// Total pairs formula :
// n(n-1)/2 = TP