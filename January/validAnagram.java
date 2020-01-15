package January;

public class validAnagram {
    public boolean isAnagram(String s, String t) {
        boolean isAnagram = true;

        // Sort the two strings into array of characters
        char[] array = s.toCharArray();
        char[] array2 = t.toCharArray();
        Arrays.sort(array);
        Arrays.sort(array2);

        if (array.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] != array2[i]) {
                isAnagram = false;
                break;
            }
            isAnagram = true;
        }

        return isAnagram;

    }
}