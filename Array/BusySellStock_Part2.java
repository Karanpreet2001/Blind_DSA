package Array;

//You are given an integer array prices where prices[i] is the price of a given stock on the ith day.


//On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of th
//e stock at any time. However, you can buy it then immediately sell it on the same day.



//Input: prices = [7,1,5,3,6,4]
//Output: 7
//Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
//Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
//Total profit is 4 + 3 = 7.


public class BusySellStock_Part2 {

    public static void main(String[] args) {
        
        int[] prices = {7,1,5,3,6,4};

        int profit = maxProfit(prices);
        System.out.println(profit+"");
    }

    private static int maxProfit(int[] prices) {

        // if(price[i] > price[i-1]) buy at i-1 and sell at i
        
        int profit=0;

        for (int i = 1; i < prices.length; i++) {
            if(prices[i]\ > prices[i-1]){
                profit += prices[i] - prices[i-1];
            }
        }

        return profit;
    }
    
}
