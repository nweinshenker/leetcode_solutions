package TwoPointers;

public class LongPressed {
    public boolean isLongPressedName(String name, String typed) {
        if (name.length() > typed.length())
            return false;
        int ptr1 = 0, ptr2 = 0;

        int anchor1 = 0, anchor2 = 0;
        while (ptr1 < name.length() && ptr2 < typed.length()) {

            // Get the same character for the name
            while (ptr1 + 1 < name.length() && name.charAt(ptr1) == name.charAt(ptr1 + 1)) {
                ptr1++;
            }
            while (ptr2 + 1 < typed.length() && typed.charAt(ptr2) == typed.charAt(ptr2 + 1)) {
                ptr2++;
            }

            if (name.charAt(ptr1) != typed.charAt(ptr2) || ptr1 - anchor1 > ptr2 - anchor2) {
                return false;
            }
            anchor1 = ptr1 + 1;
            anchor2 = ptr2 + 1;

            ptr1++;
            ptr2++;
        }

        if (ptr1 < name.length()) {
            return false;
        }
        while (ptr2 < typed.length() && ptr1 == name.length()) {
            if (typed.charAt(ptr2) != name.charAt(ptr1 - 1)) {
                return false;
            }
            ptr2++;
        }

        return true;
    }

}
