class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<Character>();

        char [] array = s.toCharArray();

        for (char c : array) {
            if (!stack.isEmpty()) {
                if (stack.peek() != c && stack.peek() == Character.toLowerCase(c)) {
                    stack.pop();
                }
                else if (stack.peek() != c && stack.peek() == Character.toUpperCase(c)) {
                    stack.pop();
                }
                else {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }
}