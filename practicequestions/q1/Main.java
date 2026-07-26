package practicequestions.q1;

import java.util.*;

public class Main{
    
    public static int getCount(int [] nums){ 
        
        int count = 0;
        int maxValue = nums[0];
        
        for(int i = 0; i<nums.length; i++){
            
            if( i == 0 ){
                count++;
            }
            else if( nums[i] > nums[i - 1] && nums[i] > maxValue ){
                count++;
                maxValue = nums[i];
            }
            else{
            }
            
            
        }
        return count;
        
    }
    
    public static void main(String [] args){
        
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            
            int [] nums = new int[size];
            
            for(int i = 0; i<nums.length; i++){
                nums[i] = sc.nextInt();
            }
            
            System.out.println(getCount(nums));
        }
    }
}
