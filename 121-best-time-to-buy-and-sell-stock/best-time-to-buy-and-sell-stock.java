class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            ans = Math.max(ans, prices[i]-min);
        }
        return ans;
    }
}