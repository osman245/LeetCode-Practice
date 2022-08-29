class Solution {
    public int maxProfit(int[] prices) {
        /*sliding window problem .. we initially make the first element in the prices array the minprofit...
         then we go on and compare the minprofit of all the past iterated values against the
         the recent element value..... if the element is greater then the minProfit value, it could potientally be the maxprofit, thus we check..
       int minProfit = Integer.MAX_VALUE;
       int maxProfit = 0;

       Time complexity: O(n)
        */
        for(int i = 0; i < prices.length;i++) {
            if(prices[i] < minProfit){
                minProfit = prices[i];
            }else if(prices[i] - minProfit > maxProfit) {
                maxProfit = prices[i] - minProfit;
            }
        }

        return maxProfit;



    }
}