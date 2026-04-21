
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //Approach 1: Brute force O((n+m)log(n+m))

        // ArrayList<Integer> mergedArray = new ArrayList<>();

        // for(int i: nums1)
        // {
        //     mergedArray.add(i);
        // }

        // for(int j: nums2)
        // {
        //     mergedArray.add(j);
        // }

        // Collections.sort(mergedArray);

        // int length = mergedArray.size();

        // if(length % 2 != 0)
        // {
        //     int index = (int) Math.ceil(length/2);
        //     return (double) mergedArray.get(index);
        // } else {
        //     int midIndex = length/2;
        //     return (double) (mergedArray.get(midIndex - 1) + mergedArray.get(midIndex))/2;
        // }

        //Approach 2: 
        
          int left = (nums1.length + nums2.length + 1) / 2;
        int right = (nums1.length + nums2.length + 2) / 2;
        return (getKth(nums1, nums1.length, nums2, nums2.length, left, 0, 0) +
                getKth(nums1, nums1.length, nums2, nums2.length, right, 0, 0)) / 2.0;
    }

    public int getKth(int[] a, int m, int[] b, int n, int k, int aStart, int bStart) {
        if (m > n) {
            return getKth(b, n, a, m, k, bStart, aStart);
        }
        if (m == 0) {
            return b[bStart + k - 1];
        }
        if (k == 1) {
            return Math.min(a[aStart], b[bStart]);
        }

        int i = Math.min(m, k / 2);
        int j = Math.min(n, k / 2);

        if (a[aStart + i - 1] > b[bStart + j - 1]) {
            return getKth(a, m, b, n - j, k - j, aStart, bStart + j);
        } else {
            return getKth(a, m - i, b, n, k - i, aStart + i, bStart);
        }
    }
}
