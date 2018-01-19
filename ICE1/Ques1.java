public class Ques1 {
    public static void main(String[] args) {
        int a = 2;
        final int B = 5;
        int c = 4;
        int d = 3;

        System.out.println(a / c * d);

        int res = a++ * B / c + d;
        System.out.println(res);

        a += 2;
        d /= 3 - 1;
        System.out.println(a + ", " + d);

        double f = (double) (B + 4) / 2;

        System.out.println(f);
        System.out.println(d + 1 + "bc" + B + c);
    }
}