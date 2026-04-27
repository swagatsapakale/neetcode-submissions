class Solution {
    public int findDuplicate(int[] nums) {
        //Approach 1: Brute force
        HashSet<Integer> hSet = new HashSet<>();
        for(int ele: nums)
        {
            if(hSet.contains(ele))
            {
                return ele;
            } 
            hSet.add(ele);
        }

        return -1;
    }
}
