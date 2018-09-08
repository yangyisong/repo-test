import java.util.HashMap;

//：分析以下需求，并用代码实现
//        1.统计每个单词出现的次数
//        2.有如下字符串"If you want to change your fate I think you must come to the dark horse to learn java"(用空格间隔)
//        3.打印格式：
//        to=3
//        think=1
//        you=2
//........
public class sdfs {
    public static void main(String[] args) {
        String s = "If you want to change your fate I think you must come to the dark horse to learn java";
        String[] split = s.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for (String s1 : split) {
            if(!map.containsKey(s1)){
                map.put(s1,1);
            }else {
                map.put(s1,map.get(s1)+1);
            }
        }
        System.out.println(map);

    }
}
