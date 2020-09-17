package May;

public class Max_Power {
    public int maxPower(String s) {
        if (s == null || s.length() < 1) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }

        int max = Integer.MIN_VALUE;
        char curr = s.charAt(0);
        int freq = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == curr) {
                freq++;
            } else {
                curr = s.charAt(i);
                max = Math.max(freq, max);
                freq = 1;
            }
        }

        max = Math.max(freq, max);

        return max;

    }
    
}