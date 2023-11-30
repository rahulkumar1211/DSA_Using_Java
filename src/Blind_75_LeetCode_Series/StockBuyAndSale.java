package Blind_75_LeetCode_Series;

public class StockBuyAndSale {
    /**
     * 2. Best Time to Buy and Sell Stock
     * You are given an array of prices where prices[i] is the price of a
     * given stock on an ith day.
     * You want to maximize your profit by choosing a single day to buy
     * one stock and choosing a different day in the future to sell that
     * stock.
     * Return the maximum profit you can achieve from this transaction.
     * If you cannot achieve any profit, return 0
     * Input: prices = [7,1,5,3,6,4]
     * Output: 5
     * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6),
     * profit = 6-1 = 5.
     */
    public static void main(String[] args) {
        int[] nums={7,1,5,3,6,2,4};
        System.out.println(returnProffit(nums));

    }

    static int returnProffit(int[] nums){
        int buyPrice=nums[0];
        int proffit=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<buyPrice){
                buyPrice=nums[i];
            }
            if(proffit<(nums[i]-buyPrice)){
                proffit=nums[i]-buyPrice;
            }

    }
        return proffit;
    }


}
