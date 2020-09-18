class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char [] array = s.toCharArray();

        for (char c : array) {
            if (!stack.isEmpty()) {
                if ((stack.peek() == '[' && c == ']') ||
                           (stack.peek() == '(' && c == ')') ||
                           (stack.peek() == '{' && c == '}')) {
                   stack.pop();
                } else {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }

        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}