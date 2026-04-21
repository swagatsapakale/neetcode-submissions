class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);

        String sortedS = new String(sCharArray);
        String sortedT = new String(tCharArray);
        if(sortedS.equals(sortedT))
        {
            return true;
        }
        return false;
    }
}
