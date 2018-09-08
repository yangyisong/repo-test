public class Ribit {
    public static void main(String[] args) {
        System.out.println(getRibit(24));
    }

    public static int getRibit(int month) {
       if(month==1||month==2){
           return 1;
       }else {
           return getRibit(month-1)+getRibit(month-2);
       }
    }
}
