class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hMap = new HashMap<>();

        for(String str: strs)
        {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            hMap.putIfAbsent(sortedString, new ArrayList<>());
            hMap.get(sortedString).add(str);
        }
        return new ArrayList<>(hMap.values());
    }
}
