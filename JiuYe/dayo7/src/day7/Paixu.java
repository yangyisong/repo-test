package day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Paixu {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("王1",2));
        s.add(new Student("王2",4));
        s.add(new Student("王3",1));
        Collections.sort(s,( o1,  o2) ->
                 o1.getAge()-o2.getAge()

        );




    }
}
