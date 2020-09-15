class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<Integer>();

        for (String op: ops) {
            if (op.equals("D")) {
                int top = stack.peek();
                stack.push((top * 2));
            }
            else if (op.equals("C")) {
                System.out.println("C");
                stack.pop();
            }
            else if (op.equals("+")) {
                int top = stack.pop();
                int sum = stack.peek() + top;
                stack.push(top);
                stack.push(sum);
            }
            else {
                stack.push(Integer.valueOf(op));
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }
}