import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//分析需求，完成代码：
//        1.已知日期字符串:"2015-10-20",将改日期字符串转换为日期对象
//        2.将(1)中的日期对象转换为日历类的对象
//        3.根据日期对象获取改日期是星期几,以及这一年的第几天
//        4.通过键盘录入日期字符串，格式(2015-10-20)
//        如输入：2015-10-20，输出"2015年--10月--20日 是 星期二，是2015年的第 293 天"
public class SDS {
    public static void main(String[] args) throws ParseException {
        String S = "2015-10-20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(S);
        System.out.println(parse);
        Calendar c = Calendar.getInstance();
        c.setTime(parse);
        System.out.println(c.get(Calendar.DAY_OF_WEEK)-1);
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
    }
}
