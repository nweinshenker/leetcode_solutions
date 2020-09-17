package June.Array;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Third_Maximum_Number {
    public int thirdMax(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            seen.add(num);
        }

        int maximum = Collections.max(seen);

        if (seen.size() < 3) {
            return maximum;
        }

        seen.remove(maximum);
        int secondMaximum = Collections.max(seen);
        seen.remove(secondMaximum);
        return Collections.max(seen);

    }

    // Second approach remove all the maximums until three
    // Maxiums are left
    public int thirdMax_second(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            seen.add(num);
            if (seen.size() > 3) {
                seen.remove(Collections.min(seen));
            }
        }

        if (seen.size() == 3) {
            return Collections.min(seen);
        }

        return Collections.max(seen);

    }
}