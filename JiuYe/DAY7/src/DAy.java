import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//4. 分析需求，完成代码：
//        1.从键盘录入一个日期字符串,格式为 xxxx-xx-xx,代表该人的出生日期
//        2.利用人出生日期到当前日期所经过的毫秒值计算出这个人活了多少天
public class DAy {
    public static void main(String[] args) throws ParseException {
        String s = new Scanner(System.in).next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(s);
        long time = date.getTime();
        Date d = new Date();
        long time1 = d.getTime();
        System.out.println((time1-time)/(60*60*1000*24));


    }
}
