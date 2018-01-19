public class Ques2 {
    public static void print(String x) {
        System.out.println(x);
    }

    public static String pattern(int i) {
        String x = "";
        for (int y = 0; y < i; y++) {
            x += "*";
        }
        return x;
    }

    public static void printPattern(int i, String cha) {
        String x = "";
        for (int y = 0; y < i; y++) {
            x += cha;
        }
        System.out.print(x);
    }

    public static void main(String[] args) {
        print("2A");
        // quesA: a b c d e f g h i j
        String s = "abcdefghij";
        for (int i = 0; i < 10; i++) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println("");

        for (int i = 97; i < 107; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println("");
        print("");

        print("2B");
        // quesB 0000 2222 4444 6666 8888
        for (int i = 0; i <= 8; i += 2) {
            for (int j = 0; j <= 4; j++) {
                System.out.print(i);
            }
            System.out.print(" ");
        }
        System.out.println("");
        print("");

        print("2C");
        // quesC 123 234 345 456 567 678 789
        for (int i = 1; i <= 7; i++) {
            for (int j = 0; j < 1; j++) {
                int y = i + 1;
                int z = i + 2;
                System.out.print("" + i + y + z);
            }
            System.out.print(" ");

        }
        System.out.println("");
        print("");

        // quesD
        // ***********
        // *****_*****
        // ****___****
        // ***_____***
        // **_______**
        // *_________*
        // **_______**
        // ***_____***
        // ****___****
        // *****_*****
        // ***********

        print("2D");
        int total = 11;
        System.out.println(pattern(total));
        for (int i = 0; i < 5; i++) {
            s = pattern(total);
            int mid = (total + 1) / 2 - 1;
            int noLoops = i + 1;

            StringBuilder snew = new StringBuilder(s);
            snew.setCharAt(mid, '_');

            for (int x = 1; x < noLoops; x++) {
                int left = mid - x;
                int right = total - 1 - left;
                snew.setCharAt(left, '_');
                snew.setCharAt(right, '_');
            }
            System.out.println(snew);
        }

        for (int i = 4; i > 0; i--) {
            s = pattern(total);
            int mid = (total + 1) / 2 - 1;
            int noLoops = i;

            StringBuilder snew = new StringBuilder(s);
            snew.setCharAt(mid, '_');

            for (int x = 0; x < noLoops; x++) {
                int left = mid - x;
                int right = total - 1 - left;
                snew.setCharAt(left, '_');
                snew.setCharAt(right, '_');
            }
            System.out.println(snew);
        }
        print(pattern(total));
        print("");

        int newTotal = 9;
        for (int i = -5; i < 6; i++) {
            System.out.print("*");
            int star = Math.abs(i);
            int mid = newTotal - (star * 2);
            if (star == 5) {
                printPattern(star * 2 - 1, "*");
            } else {
                printPattern(star, "*");
                printPattern(mid, "_");
                printPattern(star, "*");
            }
            System.out.print("*");
            System.out.println("");
        }


    }
}