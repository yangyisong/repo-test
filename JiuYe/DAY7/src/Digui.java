public class Digui {
    public static void main(String[] args) {
//        System.out.println(getsum(100));
        int sum = 0;
        for (int i = 1; i < 4; i++) {
           int b =getjiec(i);
            sum += b;
        }
        System.out.println(sum);


    }

    public static int getjiec(int n) {
       if(n==1){
           return 1;
       }else {
           return n*getjiec(n-1);
       }
    }

//    public static int getsum(int a) {
////        if(a==1){
////            return 1;
////        }else {
////            return a + getsum(a-1);
////        }
////    }

}
