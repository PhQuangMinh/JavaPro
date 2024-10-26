import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student>{
    private int age;

    public Student() {

    }

    public Student(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int compareTo(Student o) {
        return this.getAge() - o.getAge();
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(17));
        list.add(new Student(19));
        list.add(new Student(18));
        Collections.sort(list);
        for (Student student:list) System.out.println(student.getAge());
    }
}
