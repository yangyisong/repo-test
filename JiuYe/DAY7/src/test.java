public class test {
    public static void main(String[] args) {
        MYrand m = new MYrand();
        Thread thread = new Thread(m,"hah");
        thread.start();
        Thread thread1 = new Thread(m,"hdsah");
        thread1.start();
    }
}
