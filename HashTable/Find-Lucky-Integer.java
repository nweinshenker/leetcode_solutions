class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map = new HashMap();
        int largest = -1;
        
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]) && arr[i] == map.get(arr[i])) {
                largest = Math.max(largest, arr[i]);
            }
        }
        return largest;
    }
}