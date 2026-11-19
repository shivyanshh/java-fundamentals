import java.util.ArrayList;
import java.util.List;
import java.util.*;

//The Comparable interface in Java is used to define the natural ordering of objects of a class.
// It enables objects to be compared and sorted automatically without using an external Comparator
public class comparable_comparator {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice"));
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Charlie"));

        Collections.sort(students);

        System.out.println(students);
    }
}
class Student implements Comparable{
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int compareTo(Student other) {

        // Null safety check
        if (other == null) {
            throw new NullPointerException("Cannot compare with null");
        }

        // Safe comparison (avoids integer overflow)
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return id + "-" + name;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}