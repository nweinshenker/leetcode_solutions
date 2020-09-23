package Backtracking;

import java.util.LinkedList;
import java.util.List;

class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> list = new LinkedList<>();
        generateParenthesis(list, n, n, new StringBuilder());
        return list;
    }

    private void generateParenthesis(List<String> list, int l, int r, StringBuilder s) {
        if (l == 0 && r == 0) {
            list.add(s.toString());
            return;
        }
        if (l > 0) {
            generateParenthesis(list, l - 1, r, s.append('('));
            s.deleteCharAt(s.length() - 1);
        }
        if (r > l) {
            generateParenthesis(list, l, r - 1, s.append(')'));
            s.deleteCharAt(s.length() - 1);
        }
    }
}