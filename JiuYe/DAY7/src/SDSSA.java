//
//第三题：分析以下需求，并用代码实现
//        同时开启两个线程，共同输出1-100之间的所有数字，并且将输出奇数的线程名称打印出来
public class SDSSA {
    public static void main(String[] args) {
        MYRandoble m = new MYRandoble();
        Thread thread = new Thread(m,"hah");
        thread.start();
        Thread thread1 = new Thread(m,"hdsah");
        thread1.start();
    }
}
