package advanced;

public class ExceptionSample2 {
public static void main(String[] args) {
    System.out.println("プログラム開始");
    
    try {
        Class.forName("Java.lang.NotExistClass");
    } catch (Exception e) {  //Exception e　ですべての例外をキャッチできる
        e.printStackTrace();
    } finally{
        //後処理
        System.out.println("finally");
    }
    
    
    //ここでコンパイルエラー（ClassNotFoundException　検査例外）→try catch（クイックフィックスから）で例外処理する
    System.out.println("例外が発生しました");


    System.out.println("プログラム終了");
}
}
