class Solution {
    public int minAddToMakeValid(String S) {
        Stack<Character> stack = new Stack<>();
        int ans = 0;

        for(char c : S.toCharArray()){
            if(c == '('){
                stack.push(c);
            }else if(!stack.empty() && stack.peek() == '('){
                 stack.pop();
                }else{
                  ++ans;
              }
          }
      return stack.size() + ans;
    }
}