package advanced;

public class ExceptionSample4 {
public static void main(String[] args) {
    System.out.println("プログラム開始");

    try {
        method1();
    } catch (ClassNotFoundException e) {
        System.out.println("例外が発生しました");
        e.printStackTrace();
    }

    System.out.println("プログラム終了");
}

public static void method1() throws ClassNotFoundException{ //呼び出し元に【ClassNotFoundException】をthrowする可能性があります
    Class.forName("Java.lang.NotExistClass"); //ここでコンパイルエラー
}
}
