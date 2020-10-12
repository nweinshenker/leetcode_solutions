import java.io.File;
import java.util.NoSuchElementException;

class Bucky {

    static String searchFile(File file, String search) {
        if (file.isDirectory()) {
            File[] arr = file.listFiles();
            for (File f : arr) {
                String found = searchFile(f, search);
                if (found != null)
                    return found;
            }
        } else {
            if (file.getName().equals(search)) {
                return file.getAbsolutePath();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        File f = new File("/Users/nathanweinshenker/Documents/Code2.0/Winter2019/leetcode_solutions");
        if (f.exists()) {
            System.out.println(f.getAbsolutePath());
        }
        String result = searchFile(f, "MissingWords.java");
        if (result == null) {
            throw new NoSuchElementException();
        }
        System.out.println(result);
    }
}