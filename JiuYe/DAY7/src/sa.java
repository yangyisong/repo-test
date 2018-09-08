import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.stream.Collector;

//分析以下需求，并用代码实现
//        定义Student类包含姓名：String name、年龄：int age、成绩：int score，生成空参、有参构造、set和get方法、toString方法
//        1.创建10个学生对象(其中有两个学员信息完全相同)存入集合中
//        2.去除重复的学员并遍历打印剩余学员信息(分别利用普通for循环、增强for循环、迭代器遍历)
//        3.打印最高分的学员信息
//        4.打印平均分
//        5.打印不及格的学员信息及数量
public class sa {
    public static void main(String[] args) {
        HashSet<Student2> set = new LinkedHashSet<>();
        set.add(new Student2("A",18,56));
        set.add(new Student2("AB",18,43));
        set.add(new Student2("B",18,656));
        set.add(new Student2("D",18,576));
        set.add(new Student2("AF",18,58));
        set.add(new Student2("G",18,566));
        set.add(new Student2("AG",18,89));
        set.add(new Student2("AH",18,56));
        set.add(new Student2("AHH",18,56));
        set.add(new Student2("A",18,56));
        System.out.println(set);
        Student2[] student2s = set.toArray(new Student2[10]);System.out.println(set);
        Arrays.sort(student2s, (o1,o2)->o1.getScore()-o2.getScore());
        System.out.println(student2s[set.size()-1]);

//        int max= student2s[0].getScore();
//        for (int i = 0; i < student2s.length; i++) {
////            if(student2s[i].getScore()>max){
//                max=student2s[i].getScore();
//                System.out.println(max);
//            }
//        }
        int count = 0;
        for (Student2 student2 : set) {
            count += student2.getScore();
            if(student2.getScore()<60){
                System.out.println(student2);
            }
        }

        System.out.println(count/set.size());
    }

}
