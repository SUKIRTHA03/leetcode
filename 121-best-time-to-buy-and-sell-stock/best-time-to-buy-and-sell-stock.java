class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int minPrice=prices[0];
        int maxPrice=0;
        for(int i=1;i<n;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
            int profit = prices[i]-minPrice;
            if(profit>maxPrice){
                maxPrice=profit;
            }
            
        }
            return maxPrice;

    }
}