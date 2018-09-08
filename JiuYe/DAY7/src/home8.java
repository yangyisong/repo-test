
//问题：对Java基础班学生的考试成绩进行排序
//        1.	定义一个学生类，有两个属性。姓名，考试成绩
//        2.	在测试类中定义一个学生数组，存储学生信息。
//        3.	使用Lambda省略格式写法对学生数组按照考试成绩由高到低进行排序。
//

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class home8 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三丰", 90));
        list.add(new Student("张无忌", 98));
        list.add(new Student("赵敏", 97));
        list.add(new Student("郭襄", 87));
        Collections.sort(list, (o1, o2) -> o2.getScore() - o1.getScore());
        for (Student student : list) {
            System.out.println(student);
        }
    }
}

