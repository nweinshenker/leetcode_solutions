class Solution {
    public String decodeString(String s) {
        String temp = "";
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars){
            if(c == ']') {
                buildString(stack);
            }
            else stack.push(c);
        }
        while (!stack.empty()){
            temp = stack.pop() + temp;
        }

        return temp;
    }
    
    private void buildString(Stack<Character> stack) {
        String temp = "";
        while (stack.peek() != '['){
            temp = stack.pop() + temp ;
        }
        stack.pop();
        int repeat = getRepeatCount(stack);
        temp = temp.repeat(repeat);

        char[] chars = temp.toCharArray();
        for (char c : chars){
            stack.push(c);
        }
    }
     private int getRepeatCount(Stack<Character> stack) {
        String temp = "";
        while (!stack.empty() && (stack.peek() >= 48 && stack.peek()<= 57 ))
            temp = stack.pop() + temp;
        return Integer.parseInt(temp);
    }
}