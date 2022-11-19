package sorting_stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingUsingStream {

    public static void main(String[] args) {
      /*  List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(6);
        l.add(3);
        l.add(1);
        l.add(9);
        l.add(9);

        List<Integer> list = l.stream().sorted(Comparator.comparingInt(c -> c)).collect(Collectors.toList());
        System.err.println(list);*/
        List<Student> stu = new ArrayList<>();
        stu.add(new Student(2, "q"));
        stu.add(new Student(4, "e"));
        stu.add(new Student(6, "a"));
        stu.add(new Student(7, "s"));
        stu.add(new Student(9, "z"));
        stu.add(new Student(9, "z"));

        List<Student> aa = stu.stream()
                // .sorted(Comparator.comparingInt(Student::getMark))
                .sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
        aa.forEach(q -> System.err.println(q.getName() + "  " + q.getMark()));
    }


}

