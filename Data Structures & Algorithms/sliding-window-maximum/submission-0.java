class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        // for(int i = 0; i < k; i++)
        // {
        //     if(nums[i] > currentWindowMax)
        //     {
        //         currentWindowMax = nums[i];
        //     }
        // }
        // ans[0] = currentWindowMax;

        int left = 0;
        int right = left+k;
        while(right <= nums.length)
        {
            int currentWindowMax = Integer.MIN_VALUE;
            for(int i = left; i < right; i++)
            {
                if(nums[i] > currentWindowMax)
                {
                    currentWindowMax = nums[i];
                }
            }
            list.add(currentWindowMax);
            left++;
            right++;
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
        {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
