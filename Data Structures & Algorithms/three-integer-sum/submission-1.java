class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < nums.length - 2; i++)
        {
            for(int j = i + 1; j < nums.length - 1; j++)
            {
                for(int k = j + 1; k < nums.length; k++)
                {
                    if(nums[i] + nums[j] + nums[k] == 0)
                    {
                        List<Integer> triplet = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                        Collections.sort(triplet);
                        ans.add(triplet);
                    }
                }
            }
        }
        System.out.println(ans);
        for(int i = 0; i < ans.size() - 1; i++)
        {
            for(int j = i+1; j < ans.size(); j++)
            {
                if(ans.get(i).equals(ans.get(j)))
                {
                    ans.remove(j);
                    j--;
                }
            }
        }
        return ans;
    }
}
