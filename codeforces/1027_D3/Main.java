import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            int tmp = Integer.parseInt(sc.nextLine());
            double sqrt = Math.sqrt(tmp);
            if (sqrt == (int) sqrt) {
                System.out.println((int) sqrt + " " + 0);
            } else {
                System.out.println(-1);
            }
        }
    }
}