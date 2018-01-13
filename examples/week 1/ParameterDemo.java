public class ParameterDemo {
    public static int compute(int input) {
        int sum = 0;
        for (int i = 0; i <= input; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        // 1 + 2 + 3 + 4 + 5 = 15
        int sum = 0;
        for (int i = 0; i <= 5; i++) {
            sum += i;
        }
        System.out.println(sum);

        int total = 0;
        for (int i = 0; i <= 10; i++) {
            total += i;
        }
        System.out.println(total);

        System.out.println(compute(5));
    }
}