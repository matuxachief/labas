package labs.laba2_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Studenttt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String studentName = in.next();
            int studentAge = in.nextInt();
            students.add(new Student(studentName, studentAge));
        }

        Sorting<Student> sorter = new StudentSort();
        sorter.sort(students);

        StringBuilder output = new StringBuilder();
        for (Student student : students) {
            output.append(student.getName()).append(" ").append(student.getAge()).append("\n");
        }
        System.out.print(output);
    }
}