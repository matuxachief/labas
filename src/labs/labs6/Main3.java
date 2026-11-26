package labs.labs6;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextDouble()) return;
        double a = scanner.nextDouble();

        double left = 1.0;
        double right = Math.max(a, 2.0);

        for (int i = 0; i < 100; i++) {
            double mid = (left + right) / 2.0;
            double val = mid * mid - mid + Math.sqrt(mid);

            if (val < a) {
                left = mid;
            } else {
                right = mid;
            }
        }

        System.out.printf("%.6f%n", left);
        scanner.close();
    }
}