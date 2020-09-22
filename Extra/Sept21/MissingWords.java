import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class MissingWords {

    private static HashMap<String, Integer> map = new HashMap<String, Integer>();

    public static void main(String[] args) {

        // BufferedReader br = null;
        // String strLine = "";
        // try {
        //     br = new BufferedReader(new FileReader("./host_log.txt"));
        //     while ((strLine = br.readLine()) != null) {
        //         System.out.println(strLine);
        //     }
        //     br.close();
        // } catch (FileNotFoundException e) {
        //     System.err.println("File not found");
        // } catch (IOException e) {
        //     System.err.println("Unable to read the file.");
        // }

        try {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        System.out.println("here");
        String line = null;
        while ((line = br.readLine()) != null) {
        String hostname = line.split("\\s+")[0];
        map.put(hostname, map.getOrDefault(hostname, 0) + 1);
        }
        br.close();
        } catch (Exception e) {
        System.err.println("Error: Couldn't read IO Stream");
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
        System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
