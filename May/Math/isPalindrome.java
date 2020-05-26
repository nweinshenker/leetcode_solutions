package May.Math;

import java.util.ArrayList;

public class isPalindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }

        ArrayList<Integer> list = new ArrayList<>();
        boolean first = false;
        while (x != 0) {
            if (first == false) {
                list.add(x % 10);
                x = x / 10;
                first = true;
            } else {
                x = Math.abs(x);
                list.add(x % 10);
                x = x / 10;
            }
        }

        for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
            if (list.get(i) != list.get(j)) {
                return false;
            }
        }

        return true;
    }
    
}