class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        //Approach 1: Brute force O(nlogn)
        // Arrays.sort(nums);

        // int longest = 1;
        // int currentLen = 1;

        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i] == nums[i - 1]) {
        //         // ignore duplicates
        //         continue;
        //     } else if (nums[i] == nums[i - 1] + 1) {
        //         // consecutive so extend current streak
        //         currentLen++;
        //     } else {
        //         // gap finalize current streak and start new
        //         longest = Math.max(longest, currentLen);
        //         currentLen = 1;
        //     }
        // }
        // longest = Math.max(longest, currentLen);
        // return longest;

        //Approach 2: using HashSet - O(n)
        Set<Integer> hSet = new HashSet<>();
        int count = 1;
        for(int ele: nums) hSet.add(ele);

        int longest = 0;
        for(int num: nums)
        {
            if(!hSet.contains(num - 1))
            {
                int current = num;
                int length = 1;

                while(hSet.contains(current + 1))
                {
                    current++;
                    length++;
                }

                longest = Math.max(length, longest);
            }
        }

        return longest;
    }
}
