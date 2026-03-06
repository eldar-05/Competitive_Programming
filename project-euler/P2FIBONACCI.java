public class P2FIBONACCI {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int sum = 0;
        while (a <= 4000000) {
            if (a % 2 == 0) {
                sum += a;
            }

            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println(sum);
    }
}