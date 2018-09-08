import java.util.ArrayList;

//定义一个泛型方法，此方法接收一个集合以及此集合的一个元素，返回此元素在集合中的位置，如果不存在则返回-1
public class sd {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("eww");
        list.add("ds");
        list.add("eds");
        System.out.println(getint(list, "dds"));
    }
    public static int getint(ArrayList<String> list,String  str){
        if(list.contains(str)){
            for (int i = 0; i <list.size() ; i++) {
                if(list.get(i).equals(str)){
                    return i;
                }
            }


        }
        return -1;
    }
}
