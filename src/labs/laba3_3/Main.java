package labs.laba3_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>(List.of(5, 2, 8, 1, 9));
        new GenericInsertionSort<Integer>().sort(ints);
        System.out.println("Integer: " + ints);

        List<String> strings = new ArrayList<>(List.of("banana", "apple", "cherry"));
        new GenericInsertionSort<String>().sort(strings);
        System.out.println("String: " + strings);
    }
}