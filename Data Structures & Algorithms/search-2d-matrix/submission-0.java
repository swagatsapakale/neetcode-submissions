class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //Approach 1: Brute force O(m*n)
        // for(int i = 0; i < matrix.length; i++)
        // {
        //     for(int j = 0; j < matrix[i].length; j++)
        //     {
        //         if(matrix[i][j] == target)
        //         {
        //             return true;
        //         }
        //     }
        // }
        // return false;

        //Approach 2: O(mlogn)
        // for(int i = 0; i < matrix.length; i++)
        // {
        //     int low = 0;
        //     int high = matrix[i].length - 1;

        //     while(low <= high)
        //     {
        //         int mid = low + (high - low) / 2;
        //         if(matrix[i][mid] == target)
        //         {
        //             return true;
        //         } else if(matrix[i][mid] < target)
        //         {
        //             low = mid + 1;
        //         } else {
        //             high = mid - 1;
        //         }
        //     }
        // }
        // return false;

        //Approach 3: O(log(m*n))
        int row = -1;
        for(int i = 0; i < matrix.length; i++)
        {
            int cols = matrix[i].length - 1;

            if(matrix[i][0] <= target && matrix[i][cols] >= target)
            {
                row = i;
                break;
            }
        }

        if(row == -1)
        {
            return false;
        }

        for(int j = 0; j < matrix[row].length; j++)
        {
            int low = 0;
            int high =  matrix[row].length - 1;

            while(low <= high)
            {
                int mid = low + (high - low) / 2;
                if(matrix[row][mid] == target)
                {
                    return true;
                } else if (matrix[row][mid] < target)
                {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return false;
    }
}
