class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] product = new int[n];
        for(int i = 0; i < nums.length; i++)
        {
            int prod = 1;
            for(int j = 0; j < nums.length; j++)
            {
                if(i != j)
                {
                    prod *= nums[j];
                }
            }
            product[i] = prod;
        }
        return product;
    }
}  
