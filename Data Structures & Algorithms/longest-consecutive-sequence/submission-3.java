class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);

        int longest = 1;
        int currentLen = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                // duplicate — ignore
                continue;
            } else if (nums[i] == nums[i - 1] + 1) {
                // consecutive — extend current streak
                currentLen++;
            } else {
                // gap — finalize current streak and start new
                longest = Math.max(longest, currentLen);
                currentLen = 1;
            }
        }
        longest = Math.max(longest, currentLen);
        return longest;

    }
}
