package May.TwoPointers;

public class Sorted_Squares_Array {
    // My solution 
    public int[] sortedSquares(int[] A) {
        int[] sorted = new int[A.length];
        int start = 0;
        int end = A.length - 1;
        int marker = A.length - 1;
        while (start <= end && marker >= 0) {
            int first = (int) Math.pow(A[start], 2);
            int last = (int) Math.pow(A[end], 2);

            if (first < last) {
                sorted[marker] = last;
                marker--;
                end--;
            } else {
                sorted[marker] = first;
                start++;
                marker--;
            }
        }

        return sorted;
    } 
}