package home;

public class home4 {
        public int start = 1;
        public int end = 99;
        public static void main (String[] args) {

            new home4().method();
        }
        public void method() {
            Runnable a =     new Runnable(){
                @Override
                public void run() {
                    if(start<=end){
                        System.out.println(start++);
                    }
                }
            };
            Thread t = new Thread( a );
            t.start();
        }
    }

}
