package labs.laba3_3;

public class Student implements Comparable<Student> {
    private final String name;
    private final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student another) {
        int nameResult = this.name.compareTo(another.name);
        if (nameResult != 0) {
            return nameResult;
        }
        return Integer.compare(this.age, another.age);
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}