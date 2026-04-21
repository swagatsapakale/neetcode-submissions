class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        //Approach 1: Brute force - O(n^2)
        
        // for(int i = 0; i < numbers.length - 1; i++)
        // {
        //     for(int j = i+1; j < numbers.length; j++)
        //     {
        //         if(numbers[i] + numbers[j] == target)
        //         {
        //             ans[0] = i+1;
        //             ans[1] = j+1;
        //         }
        //     }
        // }
        // return ans;

        //Approach 2: 
        int start = 0;
        int end = numbers.length - 1;

        while(start < end)
        {
            if(numbers[start]+numbers[end] == target)
            {
                ans[0] = start+1;
                ans[1] = end+1;
                break;
            } else if(numbers[start]+numbers[end] < target)
            {
                start++;
            } else {
                end--;
            }
        }
        return ans;
    }
}
