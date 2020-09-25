package TwoPointers;

public class SquaresSortedArray {
        public int[] sortedSquares(int[] A) {
            int [] copy = new int [A.length];
            int i = 0, j = A.length - 1;
            
            int insert = A.length - 1;
            while (i <= j ) {
                if (Math.abs(A[j]) > Math.abs(A[i])) {
                    copy[insert] = (int) Math.pow(A[j], 2);
                    j--;
                } else {
                    copy[insert] = (int)Math.pow(A[i], 2);
                    i++;
                }
                insert--;
            }
            
            return copy;
        }
}
