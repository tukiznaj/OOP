public class LoopExample {
    public static void main(String[] args) {
        // 1 2 3 4 5
        // 1 2 3 4 5
        // 1 2 3 4 5
        // 1 2 3 4 5
        // 1 2 3 4 5
        /*for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println("");
        }*/

        // *****
        // ****
        // ***
        // **
        // *
        int size = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}