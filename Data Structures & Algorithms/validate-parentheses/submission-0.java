class Solution {
    public boolean isValid(String s) {
        //Approach 1: Brute force O(n^2)
        // while(s.contains("()") || s.contains("{}") || s.contains("[]"))
        // {
        //     s = s.replace("()", "");
        //     s = s.replace("{}", "");
        //     s = s.replace("[]", "");
        // }

        // return s.isEmpty();

        //Approach 2: Stack O(n)
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put('}', '{');
        closeToOpen.put(']', '[');

        for(char c: s.toCharArray()) {
            if(closeToOpen.containsKey(c))
            {
                if(!stack.isEmpty() && stack.peek() == closeToOpen.get(c))
                {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
