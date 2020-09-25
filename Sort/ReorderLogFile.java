package Sort;

import java.util.Arrays;
import java.util.Comparator;

public class ReorderLogFile {
    public static String[] compareLogs(String[] logs) {
        Comparator<String> customComp = new Comparator<String>() {
            @Override
            public int compare(String log1, String log2) {
                String[] array1 = log1.split("\\s+");
                String[] array2 = log2.split("\\s+");

                boolean isDigit1 = Character.isDigit(array1[1].charAt(0));
                boolean isDigit2 = Character.isDigit(array2[1].charAt(0));

                if (isDigit1 && isDigit2) {
                    int idx1 = log1.indexOf(" ");
                    int idx2 = log2.indexOf(" ");

                    // Get the compare code for the following words
                    int cmp = log1.substring(idx1 + 1).compareTo(log2.substring(idx2 + 1));
                    if (cmp != 0) {
                        return cmp;
                    }
                    return log1.compareTo(log2);
                } else if (isDigit1 && !isDigit2) {
                    return 1;
                } else if (!isDigit1 && isDigit2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };

        Arrays.sort(logs, customComp);
        return logs;
    }
}
