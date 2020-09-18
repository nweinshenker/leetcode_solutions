public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0; int power = 31;
        while (power >= 0) {
            res += (n & 1) << power;
            n = n >> 1;
            power -= 1;
        }
        
        return res;
    }
}