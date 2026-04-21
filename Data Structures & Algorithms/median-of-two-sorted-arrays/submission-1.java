
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //Approach 1: Brute force O(n)

        ArrayList<Integer> mergedArray = new ArrayList<>();

        for(int i: nums1)
        {
            mergedArray.add(i);
        }

        for(int j: nums2)
        {
            mergedArray.add(j);
        }

        Collections.sort(mergedArray);

        int length = mergedArray.size();

        if(length % 2 != 0)
        {
            int index = (int) Math.ceil(length/2);
            return (double) mergedArray.get(index);
        } else {
            int midIndex = length/2;
            return (double) (mergedArray.get(midIndex - 1) + mergedArray.get(midIndex))/2;
        }
    }
}
