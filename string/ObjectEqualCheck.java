package string;

public class ObjectEqualCheck {

    public static void main(String[] args) {
        Student s = new Student(12, "A");
        Student s1 = new Student(12, "A");

        System.err.println(s.equals(s1));  // content comparison
        System.err.println(s == s1);   // reference comparison

    }
}
