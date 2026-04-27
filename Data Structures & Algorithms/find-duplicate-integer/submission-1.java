class Solution {
    public int findDuplicate(int[] nums) {
        //Approach 1: Brute force - O(n) + O(n) space
        // HashSet<Integer> hSet = new HashSet<>();
        // for(int ele: nums)
        // {
        //     if(hSet.contains(ele))
        //     {
        //         return ele;
        //     } 
        //     hSet.add(ele);
        // }

        // return -1;

        //Approach 2: Negative indexing
        for(int num: nums)
        {
            int index = Math.abs(num) - 1;
            if(nums[index] < 0)
            {
                return Math.abs(num);
            }
            nums[index] *= -1;
        }
        return -1;
        
    }
}
