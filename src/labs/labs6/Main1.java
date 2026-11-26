package labs.labs6;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] queries = new int[m];
        for (int i = 0; i < m; i++) {
            queries[i] = scanner.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int query = queries[i];
            int idx = Arrays.binarySearch(arr, query);

            if (idx >= 0) {
                System.out.print(arr[idx]);
            } else {
                int insertionPoint = -idx - 1;

                int leftVal = (insertionPoint > 0) ? arr[insertionPoint - 1] : Integer.MAX_VALUE;
                int rightVal = (insertionPoint < n) ? arr[insertionPoint] : Integer.MAX_VALUE;

                if (Math.abs(leftVal - query) <= Math.abs(rightVal - query)) {
                    System.out.print(leftVal);
                } else {
                    System.out.print(rightVal);
                }
            }

            if (i < m - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        scanner.close();
    }
}