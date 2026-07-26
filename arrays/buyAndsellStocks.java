public class buyAndsellStocks {
    public static void maxProfit(int [] arr){
        int price = arr[0];
        int sell = 0;
        int profit = 0;
        int maxProfit = 0;
        int buy = price;
        for(int i = 0; i<arr.length; i++){
            
            if(arr[i]<price){
                buy = arr[i];
            }
            sell = arr[i];
            profit = sell - buy;
            maxProfit = Math.max(profit, maxProfit);
            price = arr[i];
        }
            
            System.out.println(maxProfit);
        }
        // profit 0 return 0
     
    public static void main(String [] args){
        int [] arr = {7,1,5,3,6,4};
        maxProfit(arr);

    }
}