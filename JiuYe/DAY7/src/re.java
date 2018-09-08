import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class re {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("美女.jpg");
        FileOutputStream fos = new FileOutputStream("大美女.jpg");
        byte[] byt = new byte[1024];
        int len;
        while ((len=fis.read(byt))!=-1){
            fos.write(byt,0,len);
            System.out.println(len);
        }
        fis.close();
        fos.close();
    }
}
