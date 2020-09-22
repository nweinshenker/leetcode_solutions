class Bucky {
    public static void main(String[] args) {
        int WIDTH = 7;
        int HEIGHT = 3;
        char ch = 'A';
        String[][] array = new String[HEIGHT][];
        for (int i = 0; i < HEIGHT; i++) {
            array[i] = new String[WIDTH];
            for (int j = 0; j < WIDTH; j++, ch++) {
                array[i][j] = "" + ch;
            }
        }

        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++, ch++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("============================");

        for (int k = 0; k <= WIDTH + HEIGHT - 2; k++) {
            for (int j = 0; j <= k; j++) {
                int i = k - j;
                if (i < HEIGHT && j < WIDTH) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}