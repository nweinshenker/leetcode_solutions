package HashTable;

import java.util.HashMap;

public class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        // Want subArraySum[L...R] = pref[R] - pref[L - 1];
        // Pref[R] - Pref[L -1] == k
        // We want count freqencies of number times Pref[L-1] occurs
        // Use a hashmap to keep track of frequency sum
        int n = nums.length;
        int prefSum = 0;
        int ans = 0;
        HashMap<Integer, Integer> countPref = new HashMap<Integer,Integer>();
        countPref.put(prefSum, 1);
        for (int R = 0; R < n; R++) {
            prefSum += nums[R];
            int need = prefSum - k;
            if (countPref.containsKey(need)) {
                ans += countPref.get(need);
            }
            countPref.put(prefSum, countPref.getOrDefault(prefSum, 0) + 1);
        }

        return ans;
    }
}
