class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maximumProfit=0;

        for(int price:prices){
            if(price<minPrice){
                minPrice=price;
            }
            else{
                maximumProfit=Math.max(maximumProfit,price-minPrice);
            }
        }
        return maximumProfit;
    }
}