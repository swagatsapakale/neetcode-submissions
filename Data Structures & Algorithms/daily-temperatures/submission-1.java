class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // int[] results = new int[temperatures.length];

        // //Approach 1 - Brute Force - O(n^2)
        // for(int i = 0; i < temperatures.length; i++)
        // {
        //     for(int j = i+1; j < temperatures.length; j++)
        //     {
        //         if(temperatures[j] > temperatures[i])
        //         {
        //             results[i] = j - i;
        //             break;
        //         }
        //     }
        // }

        // return results;

        //Approach 2 - monotonically decreasing stack - O(n)
        int[] res = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>(); // pair: [temp, index]

        for (int i = 0; i < temperatures.length; i++) {
            int t = temperatures[i];
            while (!stack.isEmpty() && t > stack.peek()[0]) {
                int[] pair = stack.pop();
                res[pair[1]] = i - pair[1];
            }
            stack.push(new int[]{t, i});
        }
        return res;
    }
}
