class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int minValue = nums[0];

        while(low <= high)
        {
            if(nums[low] < nums[high])
            {
                minValue = Math.min(minValue, nums[low]);
                break;
            }

            int mid = low + (high - low) / 2;
            minValue = Math.min(minValue, nums[mid]);

            if(nums[low] <= nums[mid])
            {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return minValue;
    }
}
