class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        for (int end = s.length - 1; end >= 0; end--) {
            if (start < end) {
                swap(start, end, s);
                start++;
            } else {
                break;
            }
        }
    }

    public void swap(int start, int end, char[] s) {
        char temp = s[start];
        System.out.println(temp);
        s[start] = s[end];
        s[end] = temp;
    }
}