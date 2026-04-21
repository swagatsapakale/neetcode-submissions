class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        //Approach 1: Brute force
        // int speed = 1;
        // while (true) {
        //     long totalTime = 0;
        //     for (int pile : piles) {
        //         totalTime += (int) Math.ceil((double) pile / speed);
        //     }

        //     if (totalTime <= h) {
        //         return speed;
        //     }
        //     speed++;
        // }

        //Approach 2: Binary search
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        int res = high;

        while(low <= high)
        {
            int k = low + (high - low) / 2;

            long totalTime = 0;
            for(int bananas: piles) {
                totalTime += Math.ceil((double) bananas / k);
            }
            if(totalTime <= h) {
                res = k;
                high = k - 1;
            } else {
                low = k + 1;
            }
        }

        return res;

    }
}
