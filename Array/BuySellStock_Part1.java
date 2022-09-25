package Array;
public class BuySellStock_Part1 {
    

    //You are given an array prices where prices[i] is the 
    //price of a given stock on the ith day.

    //You want to maximize your profit by choosing a single
    // day to buy one stock and choosing a different day in the future to sell that stock.

    //Return the maximum profit you can achieve from this transaction. 
    //If you cannot achieve any profit, return 0.


    public static void main(String[] args) {
        
        int[] prices = {7,1,5,3,6,4};
        int profit = maxProfit(prices);
        System.out.println(profit+"");
    }

    // keep tracking the minimun one so that we can find the lowest price
    // Time comp = 0(N), Space comp = 0(1)
    private static int maxProfit(int[] prices) {

        int maxProfit = 0;
        int minSoFar = prices[0];

        for (int i = 0; i < prices.length; i++) {
            
            minSoFar = Math.min(minSoFar, prices[i]);
            int profit = prices[i] - minSoFar;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }

    
}
