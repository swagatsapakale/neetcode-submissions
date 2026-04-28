class Solution {
    public int largestRectangleArea(int[] heights) {
        //  int n = heights.length;
        // int maxArea = 0;

        // for (int i = 0; i < n; i++) {
        //     int height = heights[i];

        //     int rightMost = i + 1;
        //     while (rightMost < n && heights[rightMost] >= height) {
        //         rightMost++;
        //     }

        //     int leftMost = i;
        //     while (leftMost >= 0 && heights[leftMost] >= height) {
        //         leftMost--;
        //     }

        //     rightMost--;
        //     leftMost++;
        //     maxArea = Math.max(maxArea, height * (rightMost - leftMost + 1));
        // }
        // return maxArea;

         int n = heights.length;
        int[] leftMost = new int[n];
        int[] rightMost = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            leftMost[i] = -1;
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                leftMost[i] = stack.peek();
            }
            stack.push(i);
        }

        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            rightMost[i] = n;
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                rightMost[i] = stack.peek();
            }
            stack.push(i);
        }

        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            leftMost[i] += 1;
            rightMost[i] -= 1;
            maxArea = Math.max(maxArea, heights[i] * (rightMost[i] - leftMost[i] + 1));
        }
        return maxArea;
    }
}
