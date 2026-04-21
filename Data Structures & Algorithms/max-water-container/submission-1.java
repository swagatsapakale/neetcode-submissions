class Solution {
    public int maxArea(int[] heights) {
        int maxArea = Integer.MIN_VALUE;
        //Approach 1: Brute force O(n^2)
        // for(int i = 0; i < heights.length - 1; i++)
        // {
        //     for(int j = i+1; j < heights.length; j++)
        //     {
        //         int sideA = Math.min(heights[i], heights[j]);
        //         int sideB = j - i;
        //         if(maxArea < (sideA * sideB))
        //         {
        //             maxArea = (sideA*sideB);
        //         }
        //     }
        // }

        // return maxArea;

        //Approach 2: 
        int start = 0;
        int end = heights.length - 1;

        while(start < end)
        {
            int sideA = Math.min(heights[start], heights[end]);
            int sideB = end - start;

            if(maxArea < (sideA*sideB))
            {
                maxArea = (sideA*sideB);
            }
            if(sideA == heights[start])
            {
                start++;
            } else {
                end--;
            }
        }
        return maxArea;
    }
}
