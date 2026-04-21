class Solution {
    public int maxArea(int[] heights) {
        int maxArea = Integer.MIN_VALUE;
        for(int i = 0; i < heights.length - 1; i++)
        {
            for(int j = i+1; j < heights.length; j++)
            {
                int sideA = Math.min(heights[i], heights[j]);
                int sideB = j - i;
                if(maxArea < (sideA * sideB))
                {
                    maxArea = (sideA*sideB);
                }
            }
        }

        return maxArea;
    }
}
