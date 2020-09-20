class Solution {
public int binary_fixedPoint(int[] A) {
    int end = A.length -1;
    int start = 0;
    if (A[start] > start || A[end] < end)
        return -1;
    while (start < end) {
        int mid = (end + start) /2;
        if(A[start] == start)
             return start;
        else if (A[mid] > mid) {
            end = mid;
        }else 
            start += 1;
    }
    return -1;
}      

public  int fixedPoint(int [] A) {
    int smallest = -1;
    for (int i = 0; i < A.length; i++) {
        if (A[i] == i) return i;
    }
    return i;
}
}