package labs.laba2_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Insertionnn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            numbers.add(in.nextInt());
        }

        Sorting<Integer> sorter = new InsertionSort();
        sorter.sort(numbers);

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < numbers.size(); i++) {
            if (i > 0) {
                output.append(" ");
            }
            output.append(numbers.get(i));
        }
        System.out.println(output);
    }
}