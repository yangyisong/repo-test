import java.util.ArrayList;
import java.util.Collections;

//分析以下需求，并用代码实现
//        1.定义Student类，包含姓名：String name、年龄：int age、成绩：int score，生成空参、有参构造、set和get方法、toString方法
//        2.创建5个Student对象，给对象的成员变量进行赋值，将并存入合适的集合中
//        3.统计不及格的学生人数，并输出
//        4.输出成绩最好的学生的个人信息
public class jiveheng {
    public static void main(String[] args) {
        ArrayList<Student2> list = new ArrayList<Student2>();
        list.add( new Student2("zhangsa",28,98));
          list.add( new Student2("lisi ",28,45));
        list.add( new Student2("ewewf",28,54));
        list.add( new Student2("zerwa",28,976));
        int count= 0;
        for (Student2 student2 : list) {
            if(student2.getScore()<60){
                count++;
            }

        }
        Collections.sort(list,(o1,o2)->o1.getScore()-o2.getScore());
        System.out.println(list.get(list.size()-1));
        System.out.println(count);

    }
}
