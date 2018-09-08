package day7;

public class SDAS {
        public static void main(String[] args) {
            Object obj = new Object();
            new Thread("盖伦"){
                @Override
                public void run() {
                    synchronized (obj) {
                        System.out.println(getName() + "陷入沉睡");
                        try {
                            obj.wait();
                            System.out.println("我已经醒来，开干");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }.start();
            new Thread ("亚瑟"){
                @Override
                public void run() {
                    synchronized (obj) {
                        System.out.println(getName() + "陷入沉睡");
                        try {
                            obj.wait();
                            System.out.println("我已经醒来，开干");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }.start();
            new Thread("召唤师"){
                @Override
                public void run() {
                    synchronized (obj){
                        try {
                            sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(getName()+":盖伦还不醒来草丛蹲人");
                        obj.notifyAll();
                    }
                }
            }.start();
        }


}
