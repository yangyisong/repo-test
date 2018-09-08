
//    在下面的代码中，请使用Lambda的省略格式调用 invokeDirect 方法，
// 打印输出“导演拍电影啦！”字样：
    public class Test09InvokeDirect {
        public static void main(String[] args) {
// TODO 请分别使用Lambda【省略格式】调用invokeDirect方法
            invokeDirect(()-> System.out.println("导演拍电影啦！"));

        }

        private static void invokeDirect(Director director) {
            director.makeMovie();
        }
    }

