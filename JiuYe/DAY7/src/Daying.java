import java.io.File;
import java.io.FileFilter;

public class Daying {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\杨义松\\IdeaProjects");

//        String[] list = f.list();
////        for (String s : list) {
////            System.out.println(s);
////        }
//        File[] files = f.listFiles();
//        for (File file : files) {
//            System.out.println(file.length());
//            System.out.println(file);
//        }
//            getDir(f);
            getjava(f);

    }

    private static void getjava(File f) {
        File[] files = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isFile()){
                    if(pathname.getName().endsWith(".java")){
                        return true;
                    }else {
                        return false;
                    }
                }else return true;
            }
        });
        for (File file : files) {
            if(file.isFile()){
                System.out.println(file);
            }else {
               getjava(file);
            }
        }
    }

//
//    public static void getDir(File file) {
//        File[] files = file.listFiles();
//        for (File file1 : files) {
//            if(file1.isFile()) {
//                if(file1.getName().endsWith(".java")){
//                    int dex=   file1.getName().lastIndexOf(".");
//                    System.out.println(file1.getName().substring(0, dex));
//
//                }
//
//            }else if(file1.isDirectory()){
//                getDir(file1);
//            }
//        }
//
//    }
//
//    public static void getjava(File f) {
//        File[] files = f.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return  pathname.isDirectory()||(pathname.isFile()&&pathname.getName().endsWith(".java"));
//            }
//
//
//        });
//        for (File file : files) {
//            if(file.isFile()){
//                System.out.println(file);
//            }else {
//                getjava(file);
//            }
//        }
//    }
}
