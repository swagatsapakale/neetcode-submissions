class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hMap = new HashMap<>();
        int[] result = new int[k];
        int maxEle = Integer.MIN_VALUE;
        for(int ele: nums)
        {
            hMap.put(ele, hMap.getOrDefault(ele, 0)+1);
        }

        ArrayList<ArrayList<Integer>> freq = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : hMap.entrySet()) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(entry.getValue());
            temp.add(entry.getKey());
            freq.add(temp);
        }

        Collections.sort(freq, new Comparator<ArrayList<Integer>>() {
            public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
                if(a.get(0).equals(b.get(0)))
                    return a.get(1) - b.get(1);
                return b.get(0) - a.get(0);
            }
        });

        for(int i =0; i < k; i++)
        {
            result[i] = freq.get(i).get(1);
        }

        return result;
    }
}
