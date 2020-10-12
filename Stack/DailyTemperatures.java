package Stack;

import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        int [] result = new int [T.length];
        Stack<int []> stack = new Stack<int []>();
        
        for(int i = T.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && T[i] >= stack.peek()[0]) {
                stack.pop();
            }
            if (!stack.isEmpty() && T[i] < stack.peek()[0]) {
                result[i] = stack.peek()[1] - i;
            }
            stack.push(new int [] {T[i], i});
        }
        
        return result;
    } 
}
