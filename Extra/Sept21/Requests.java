package Extra.Sept21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Requests {
    // Example: S = [I like chess]
    // T= [Like]
    public static String[] missingWords(String s, String t) {
        List<String> res = new ArrayList<String>();
        int i = 0, j = 0;

        String[] sArray = s.split("\\s");
        String[] tArray = t.split("\\s");

        while (i < sArray.length && j < tArray.length) {
            if (sArray[i].equals(tArray[j])) {
                i++;
                j++;
            } else {
                res.add(sArray[i]);
                i++;
            }
        }

        for (int k = i; k <= sArray.length - 1; k++) {
            res.add(sArray[k]);
        }

        String[] ans = new String[res.size()];
        for (int k = 0; k < res.size(); k++) {
            ans[k] = res.get(k);
        }
        return ans;

    }

    public static void main(String[] args) {
        String s = "I like cheese";
        String t = "like";

        String s2 = "I am using HackerRank to improve programming";
        String t2 = "I am using HackerRank to improve programming";

        String[] result = missingWords(s, t);
        String[] expected = new String [] {"I", "cheese"};

        String [] result2 = missingWords(s2, t2);
        String [] expected2 = new String [] {};
        System.out.println(Arrays.equals(result, expected));
        System.out.println(Arrays.equals(result2, expected2));

        
    }
}
