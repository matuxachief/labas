package labs.laba2_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentSort implements Sorting<Student> {
    private void slice(List<Student> list, int from, int to, Comparator<Student> rule) {
        if (from >= to) {
            return;
        }
        int mid = from + (to - from) / 2;
        slice(list, from, mid, rule);
        slice(list, mid + 1, to, rule);
        merge(list, from, mid, to, rule);
    }

    private void merge(List<Student> list, int from, int mid, int to, Comparator<Student> rule) {
        List<Student> leftPart = new ArrayList<>(list.subList(from, mid + 1));
        List<Student> rightPart = new ArrayList<>(list.subList(mid + 1, to + 1));

        int a = 0;
        int b = 0;
        int pos = from;

        while (a < leftPart.size() && b < rightPart.size()) {
            if (rule.compare(leftPart.get(a), rightPart.get(b)) <= 0) {
                list.set(pos, leftPart.get(a));
                a++;
            } else {
                list.set(pos, rightPart.get(b));
                b++;
            }
            pos++;
        }

        while (a < leftPart.size()) {
            list.set(pos, leftPart.get(a));
            a++;
            pos++;
        }

        while (b < rightPart.size()) {
            list.set(pos, rightPart.get(b));
            b++;
            pos++;
        }
    }

    @Override
    public void sort(List<Student> students) {
        Comparator<Student> ageOrder = Comparator.comparingInt(Student::getAge);
        Comparator<Student> nameOrder = Comparator.comparing(Student::getName);

        slice(students, 0, students.size() - 1, ageOrder);
        slice(students, 0, students.size() - 1, nameOrder);
    }
}