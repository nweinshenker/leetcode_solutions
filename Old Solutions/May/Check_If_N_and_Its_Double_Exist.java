package May;

import java.util.Set;
import java.util.HashSet;

public class Check_If_N_and_Its_Double_Exist {
    public boolean checkIfExist(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return false;
        }

        Set<Integer> seen = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (seen.contains(2 * arr[i]) || arr[i] % 2 == 0 && seen.contains(arr[i] / 2))
                return true;
            seen.add(arr[i]);
        }

        return false;
    }
}