import java.util.*;

class Bucky {
    private static int SQUAREDIM = 5;

    public static void main(String[] args) {
        char ch = 'A';
        String[][] array = new String[SQUAREDIM][];
        for( int i = 0 ; i < SQUAREDIM; i++ ) {
            array[i] = new String[SQUAREDIM];
            for( int j = 0 ; j < SQUAREDIM; j++, ch++ ) {
                array[i][j] = "" + ch;
            }
        }

        printMatrix(array);
    }

    public static void printMatrix(String [][] array) {
        for (int i = 0; i < SQUAREDIM; i++) {
            for (int j = 0; j < SQUAREDIM; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}