package labs.labs6;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextLong()) return;
        long n = scanner.nextLong();
        long w = scanner.nextLong();
        long h = scanner.nextLong();

        long left = 1;
        long right = Math.max(n * w, n * h);

        long ans = right;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            long cols = mid / w;
            long rows = mid / h;

            if (cols > 0 && rows > 0 && cols >= (n + rows - 1) / rows) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}