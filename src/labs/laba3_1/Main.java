package labs.laba3_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(scanner.nextInt());
        }
        new CountingSort().sort(nums);
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i));
            if (i < nums.size() - 1) System.out.print(" ");
        }
        System.out.println();
    }
}