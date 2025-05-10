package advanced;

public class Ex13 {
public static void main(String[] args) {
    try {
        Class.forName("Java.lang.java.langNotFoundClass");
    } catch (ClassNotFoundException e) {
    
        e.printStackTrace();
    }System.out.println("クラスが見つかりません");
}
}
