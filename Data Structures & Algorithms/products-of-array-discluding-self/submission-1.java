class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] product = new int[n];

        //Approach 1: Brute force o(n^2)
        // for(int i = 0; i < nums.length; i++)
        // {
        //     int prod = 1;
        //     for(int j = 0; j < nums.length; j++)
        //     {
        //         if(i != j)
        //         {
        //             prod *= nums[j];
        //         }
        //     }
        //     product[i] = prod;
        // }
        // return product;

        //Approch 2: 
        int[] prefixProd = new int[n];
        int[] suffixProd = new int[n];
        prefixProd[0] = nums[0];
        suffixProd[n-1] = nums[n -1];

        for(int i = 1; i < n; i++)
        {
            prefixProd[i] = prefixProd[i-1]*nums[i];
        }

        for(int i = n-2; i >= 0; i--)
        {
            suffixProd[i] = suffixProd[i+1]*nums[i];
        }
        product[0] = suffixProd[1];
        product[n-1] = prefixProd[n-2];
        for(int i = 1; i < n - 1; i++)
        {
            product[i] = prefixProd[i-1] * suffixProd[i+1];
        }
        return product;
    }
}  
