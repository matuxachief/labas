package labs.laba3_3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>(List.of(5, 2, 8, 1, 9));
        new GenericInsertionSort<Integer>().sort(ints);
        System.out.println("Integer: " + ints);

        List<String> strings = new ArrayList<>(List.of("banana", "apple", "cherry"));
        new GenericInsertionSort<String>().sort(strings);
        System.out.println("String: " + strings);

        List<LocalDateTime> dates = new ArrayList<>(List.of(
                LocalDateTime.of(2026, 11, 20, 10, 30),
                LocalDateTime.of(2025, 3, 5, 8, 0),
                LocalDateTime.of(2026, 1, 15, 23, 59)
        ));
        new GenericInsertionSort<LocalDateTime>().sort(dates);
        System.out.println("LocalDateTime: " + dates);

        List<Student> students = new ArrayList<>(List.of(
                new Student("Vasya", 21),
                new Student("Vasya", 19),
                new Student("Anton", 22),
                new Student("Antonio", 23)
        ));
        new GenericInsertionSort<Student>().sort(students);
        System.out.println("Student: " + students);

        List<UUID> uuids = new ArrayList<>(List.of(
                UUID.fromString("c9a646d3-9c61-4cb7-bfcd-ee2522c8f633"),
                UUID.fromString("123e4567-e89b-12d3-a456-426614174000"),
                UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479"),
                UUID.fromString("00000000-0000-0000-0000-000000000001")
        ));
        new GenericInsertionSort<UUID>().sort(uuids);
        System.out.println("UUID: " + uuids);
    }
}