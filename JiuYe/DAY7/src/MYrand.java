public class MYrand implements Runnable{
    int num = 100;
    @Override
    public void run() {
        while (true){
            synchronized (""){
                if(num<10){
                    break;
                }else {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+(num--));
                }
            }
        }

    }
}
