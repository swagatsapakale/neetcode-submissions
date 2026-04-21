class Solution {
    public boolean checkInclusion(String s1, String s2) {

        //Approach 1: Brute force - hitting TL
        // List<String> ans = new ArrayList<>();
        // StringBuilder str = new StringBuilder(s1);

        // recurPermute(0, str, ans);

        // for(int i = 0; i < ans.size(); i++)
        // {
        //     int left = 0;
        //     int right = s1.length() - 1;
        //     while(right < s2.length())
        //     {
        //         StringBuilder nextWord = new StringBuilder("");
        //         for(int j = left; j <= right; j++)
        //         {
        //             nextWord.append(s2.charAt(j));
        //         }
        //         if(ans.get(i).equals(nextWord.toString()))
        //         {
        //             return true;
        //         }
        //         left++;
        //         right++;
        //     }
        // }

        // return false;

        //Approach 2: O(n^2)
        char[] charArray = s1.toCharArray();
        Arrays.sort(charArray);

        String sortedS1 = new String(charArray);

        int left = 0;
        int right = s1.length() - 1;
        while(right < s2.length())
        {
            StringBuilder subStr = new StringBuilder("");
            for(int i = left; i <= right; i++)
            {
                subStr.append(s2.charAt(i));
            }
            char[] charArrayS2 = subStr.toString().toCharArray();
            Arrays.sort(charArrayS2);
            String sortedSubStr = new String(charArrayS2);
            if(sortedS1.equals(sortedSubStr))
            {
                return true;
            }
            left++;
            right++;
        }
        return false;

    }

    // static void recurPermute(int index, StringBuilder s, List<String> ans)
    // {
    //     // Base Case
    //     if (index == s.length()) {
    //         ans.add(s.toString());
    //         return;
    //     }

    //     // Swap the current index with all
    //     // possible indices and recur
    //     for (int i = index; i < s.length(); i++) {
    //         swap(s, index, i);
    //         recurPermute(index + 1, s, ans);
    //         swap(s, index, i);
    //     }
    // }

    // static void swap(StringBuilder s , int i, int j)
    // {
    //     char temp = s.charAt(i);
    //     s.setCharAt(i, s.charAt(j));
    //     s.setCharAt(j, temp);
    // }
}
