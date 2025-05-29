import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int c0 = 0;
            for (char ch : s.toCharArray()) {
                if (ch == '0') c0++;
            }
            int c1 = n - c0;
            int m = n / 2;
            int x = m - k;
            boolean ok = (0 <= x && x <= m) && (c0 >= x && c1 >= x) && ((c0 - x) % 2 == 0) && ((c1 - x) % 2 == 0);
            System.out.println(ok ? "YES" : "NO");
        }
    }
}