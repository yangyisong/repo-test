//：分析以下需求，并用代码实现
//        1.定义一个map集合,key为String类型的姓名,value为String类型地址,存入数据多条数据(假设不存在重名的情况),并用多种方式遍历
//        2.定义一个map集合,key为Student类型的对象,value为String类型的地址,存入数据多条数据(需要加入对象的唯一性判断)
//        (1)定义一个学生类Student，包含属性：姓名(String name)、年龄(int age)、成绩(int score)
//        (2)定义Map集合，用Student对象作为key，用字符串(此表示表示学生的住址)作为value
//        (3)利用四种方式遍历Map集合中的内容，格式：key::value

import java.util.HashMap;
import java.util.Set;

public class sffsg {
    public static void main(String[] args) throws IllegalAgeException {
//        HashMap<Student2,String> map = new HashMap<>();
//        map.put(new Student2("DS",324,35),"DFER");
//        map.put(new Student2("DS",34,35),"DFER");
//        map.put(new Student2("54",34,36),"DFER");
//        Set<Student2> set = map.keySet();
//        for (Student2 student2 : set) {
//            System.out.println(student2);
//        }
        Student2 s = new Student2();
        s.setAge(435);

    }
}
