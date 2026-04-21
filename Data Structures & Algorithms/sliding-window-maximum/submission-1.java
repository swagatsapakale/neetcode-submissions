class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // //Approach 1: Brute force - O(n*k)
        // ArrayList<Integer> list = new ArrayList<>();
        // int left = 0;
        // int right = left+k;
        // while(right <= nums.length)
        // {
        //     int currentWindowMax = Integer.MIN_VALUE;
        //     for(int i = left; i < right; i++)
        //     {
        //         if(nums[i] > currentWindowMax)
        //         {
        //             currentWindowMax = nums[i];
        //         }
        //     }
        //     list.add(currentWindowMax);
        //     left++;
        //     right++;
        // }
        // int[] ans = new int[list.size()];
        // for(int i = 0; i < list.size(); i++)
        // {
        //     ans[i] = list.get(i);
        // }
        // return ans;

        //Approach 2: 
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        int[] ans = new int[nums.length - k + 1];
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            heap.offer(new int[]{nums[i], i});
            if (i >= k - 1) {
                while (heap.peek()[1] <= i - k) {
                    heap.poll();
                }
                ans[idx++] = heap.peek()[0];
            }
        }

        return ans;
    }
}
