class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        int[] tFreq = new int[128];
        for (char c : t.toCharArray()) {
            tFreq[c]++;
        }

        int left = 0;
        int windowSize = t.length();

        while (windowSize <= s.length()) {
            left = 0;
            int right = windowSize;

            while (right <= s.length()) {
                String subStr = s.substring(left, right);

                // check if subStr is valid
                int[] windowFreq = new int[128];
                for (char c : subStr.toCharArray()) {
                    windowFreq[c]++;
                }

                boolean isValid = true;
                for (char c : t.toCharArray()) {
                    if (windowFreq[c] < tFreq[c]) {
                        isValid = false;
                        break;
                    }
                }

                if (isValid) {
                    return subStr; // first valid is minimum
                }

                left++;
                right++;
            }
            windowSize++; // increase window size
        }

        return "";






        // if(s.length() == t.length())
        // {
        //     return s;
        // }
        // int left = 0;
        // int right = t.length();
        // char[] tCharArray = t.toCharArray();
        // while(right < s.length())
        // {
        //     boolean isValidSubStringFound = false;
        //     String subStr = s.substring(left, right+1);

        //     boolean isCharPresent = false;
        //     for(int j = 0; j < tCharArray.length; j++)
        //     {
        //         if(subStr.contains(String.valueOf(tCharArray[j])))
        //         {
        //             isCharPresent = true;
        //         } else {
        //             isCharPresent = false;
        //         }
        //     }
        //     if(!isCharPresent)
        //     {
        //         left++;
        //         right++;
        //         if(right == s.length())
        //         {
        //             left = 0;
        //             right = (right - left) + 1;
        //         }
        //     } else {
        //         return subStr;
        //     }
        // }
        // return new String("");
    }
}
