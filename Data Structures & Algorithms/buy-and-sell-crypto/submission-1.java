class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        //Approach 1: Brute force O(n^2)
        // for(int i = 0; i < prices.length - 1; i++)
        // {
        //     for(int j = i+1; j < prices.length; j++)
        //     {
        //         if(prices[i] >= prices[j])
        //         {
        //             continue;
        //         } else {
        //             maxProfit = Math.max(maxProfit, prices[j] - prices[i]);  
        //         }
        //     }
        // }

        // return maxProfit;

        //Approach 2: 
        int l = 0, r = 1;
        
        while(r < prices.length)
        {
            if(prices[l] < prices[r])
            {
                int profit = prices[r] - prices[l];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                l = r;
            }
            r++;
        }

        return maxProfit;
    }
}
