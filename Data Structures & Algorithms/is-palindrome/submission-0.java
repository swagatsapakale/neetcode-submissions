class Solution {
    public boolean isPalindrome(String s) {
        String plainString = s.replaceAll("[^a-zA-Z0-9]+","");
        StringBuilder reversedStr = new StringBuilder(plainString);
        reversedStr.reverse();
        System.out.println(plainString);
        System.out.println(reversedStr.toString());
        return plainString.toLowerCase().equals(reversedStr.toString().toLowerCase());
    }
}
