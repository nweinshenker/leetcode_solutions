package January;

class twoSumSorted {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers.length < 2 || numbers == null) {
            return null;
        }

        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            } else {
                break;
            }
        }
        return new int[] { i + 1, j + 1 };
    }
}