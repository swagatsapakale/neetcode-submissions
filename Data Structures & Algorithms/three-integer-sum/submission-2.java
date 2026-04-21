class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        //Approach 1: Brute Force - O(n^3)
        // for(int i = 0; i < nums.length - 2; i++)
        // {
        //     for(int j = i + 1; j < nums.length - 1; j++)
        //     {
        //         for(int k = j + 1; k < nums.length; k++)
        //         {
        //             if(nums[i] + nums[j] + nums[k] == 0)
        //             {
        //                 List<Integer> triplet = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
        //                 Collections.sort(triplet);
        //                 ans.add(triplet);
        //             }
        //         }
        //     }
        // }

        // for(int i = 0; i < ans.size() - 1; i++)
        // {
        //     for(int j = i+1; j < ans.size(); j++)
        //     {
        //         if(ans.get(i).equals(ans.get(j)))
        //         {
        //             ans.remove(j);
        //             j--; //imporatant as removing shifts elements left
        //         }
        //     }
        // }
        // return ans;

        //Approach 2: 
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++)
        {
            // skip duplicate i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int start = i+1;
            int end = nums.length - 1;
            while(start < end)
            {
                int sum = nums[i] + nums[start] + nums[end];

                if(sum == 0)
                {
                    List<Integer> triplet = new ArrayList<>(Arrays.asList(nums[i], nums[start], nums[end]));
                    ans.add(triplet);
                    start++;
                    end--;

                    while (start < end && nums[start] == nums[start - 1]) start++;

                    //skip duplicate end
                    while (start < end && nums[end] == nums[end + 1]) end--;
                } else if (sum > 0)
                {
                    end--;
                } else {
                    start++;
                }
            }
        }
        System.out.println(ans);
        return ans;
    }
}
