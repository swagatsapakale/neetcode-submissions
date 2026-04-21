class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> uniqueNum = new HashSet<>();

        for(int ele: nums)
        {
            if(uniqueNum.contains((ele)))
            {
                return true;
            } else {
                 uniqueNum.add(ele);
            }
        }
        return false;
    }
}