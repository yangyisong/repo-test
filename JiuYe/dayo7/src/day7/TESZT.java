package day7;

public class TESZT {
    public static void main(String[] args) {
        secale(5,6,(x,y)-> x + y);

    }
    public static  void secale(int a,int b,Cale c){
        c.add(a,b);
    }
}
