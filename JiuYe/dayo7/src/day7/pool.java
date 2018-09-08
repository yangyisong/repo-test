package day7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class pool {
    public static void main(String[] args) {
    Runnable r =    new Runnable(){
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"你好");
            }
        };
        ExecutorService pool = Executors.newFixedThreadPool(3);
            pool.submit(r);
        pool.submit(r);
        pool.submit(r);

    }
}
