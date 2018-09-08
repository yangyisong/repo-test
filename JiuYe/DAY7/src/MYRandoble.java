public class MYRandoble implements Runnable {
    private int num =1;
    @Override
    public void run() {
        while (true){
            synchronized (""){
                if(num<=100){
                   if(num%2==1) {
                       try {
                           Thread.sleep(100);
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                       System.out.println(Thread.currentThread().getName()+":"+(num++));
                   }else {
                       try {
                           Thread.sleep(100);
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                       System.out.println(num++);
                   }
                }
            }
        }
    }
}
