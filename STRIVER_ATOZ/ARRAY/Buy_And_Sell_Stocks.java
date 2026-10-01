// TC = O(N) SC=O(1) OPTIMAL APPROACH

public class Buy_and_sell_Stocks {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {

            // if (buyPrice > prices[i]) {
            //     buyPrice = prices[i];
            // } can be compressed to one line as shown below

            buyPrice = Math.min(buyPrice, prices[i]);
            profit = Math.max(profit, prices[i] - buyPrice);
        }
        return profit;
    }
    public static void main(String args[]) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        Buy_and_sell_Stocks solution = new Buy_and_sell_Stocks();
        int maxProfit = solution.maxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit);
    }
}

// TC = O(N^2) SC=0(1);

// class Solution {
//      public int maxProfit(int[] prices) {
//          int max_profit=0;
//          for(int i = 0;i<prices.length-1;i++){
//              for(int j=i+1;j<prices.length;j++){
//                  int profit=prices[j]-prices[i];
//                  if(profit>max_profit){
//                      max_profit=profit;
//                  }
//              }
//          }
//          return max_profit;
//      }
// }