
//第五题：分析以下需求，并用代码实现
//        1.定义Person类包含姓名：String name、年龄：int age、成绩：int score，生成空参、有参构造、set和get方法、toString方法
//        2.定义Student类继承Person，属性与Person类相同
//        3.查看API中ArrayList集合中的以下方法：
//        (1)boolean add(E e) 方法
//        (2)<T> T[] toArray(T[] a)方法
//        (3)boolean addAll(Collection<? extends E> c)方法
//        4.通过查看API对以上方法的学习，完成以下功能
//        (1)ArrayList集合中存入5个Student对象，将ArrayList集合转成对应的数组Studentp[]，并遍历打印数组中的元素
//        (2)定义一个存储Person对象的ArrayList集合对象list1，并存入2个Person对象，定义一个存储Student对象的ArrayList集合对象list2，
//        并存入2个Student对象，调用addAll方法将list2的全部内容添加到list1中，遍历打印list1中的内容

import java.util.ArrayList;

public class sdas {
    public static void main(String[] args) {
//        ArrayList<Student3> list = new ArrayList<>();
//        list.add(new Student3("SAHNG",28,98));
//        list.add(new Student3("SADA",28,98));
//        list.add(new Student3("SADSG",28,98));
//        list.add(new Student3("SDFSNG",28,98));
//        Student3[] array = list.toArray(new Student3[4]);
//        for (Student3 student3 : array) {
//            System.out.println(student3);
//        }
        ArrayList<Student3> list1 = new ArrayList<>();
        list1.add(new Student3("SAHNG",28,98));
        list1.add(new Student3("SADA",28,98));
        ArrayList<Student3> list2 = new ArrayList<>();
        list2.add(new Student3("SADSG",28,98));
        list2.add(new Student3("SDFSNG",28,98));
        System.out.println(list1.addAll( list2));
        System.out.println(list1);
    }
}
