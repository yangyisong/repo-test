public class DSS {
    public int start = 1;
    public int end = 99;
    public static void main (String[] args) {

        new DSS().method();
    }
    public void method() {
        Runnable a =     new Runnable(){
            @Override
            public void run() {
                while (true) {
                    if (start <= end) {
                        System.out.println(start++);
                    }
                }
            }
        };
        Thread t = new Thread( a );
        t.start();
    }
}

