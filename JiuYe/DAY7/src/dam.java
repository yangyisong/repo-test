import java.util.ArrayList;
import java.util.List;

//1.定义List集合，存入多个字符串
//        2.删除集合元素字符串中包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)
//        3.然后利用迭代器遍历集合元素并输出
public class dam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ewrw45");
        list.add("ewrree");
        list.add("rtet34");
        list.add("ewrwe");
        for (int i = 0; i <list.size() ; i++) {
            String s = list.get(i);
            for (int j = 0; j < s.length(); j++) {
               if(s.charAt(j)>='0'&&s.charAt(j)<='9') {
                   list.remove(s);
               }
            }



        }
        for (String s : list) {
            System.out.println(s);

        }

    }
}
