import java.util.HashSet;
import java.util.LinkedHashSet;

//第一题：分析以下需求，并用代码实现
//        1.定义一个长度为10的int数组,并存入10个int类型的数据,其中有一些数据是重复的
//        2.利用集合的知识对数组进行去重,产生新数组,不能改变数组中原来数字的大小顺序
//        3.打印新数组中的内容
public class shuzu {
    public static void main(String[] args) {
        int[] arr = {2,5,7,89,6,6,75,56,56,3};
        HashSet<Integer> set = new LinkedHashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        Integer[] integers = set.toArray(new Integer[set.size()]);
        for (Integer integer : integers) {
            System.out.println(integer);
        }

    }
}
