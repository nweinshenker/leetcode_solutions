package May.Array;

import java.util.ArrayList;
import java.util.List;

public class Add_to_Array_Form {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> list = new ArrayList<Integer>();
        int i = A.length - 1;
        int carry = 0;
        int value;
        while (i >= 0) {
            value = K % 10 + carry + A[i];
            list.add(0, value % 10);
            carry = value / 10;
            K /= 10;
            i--;
        }
        while (K > 0) {
            value = K % 10 + carry;
            list.add(0, value % 10);
            carry = value / 10;
            K /= 10;
        }
        if (carry == 1)
            list.add(0, carry);
        return list;

    }
}