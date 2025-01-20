package advanced;

public class Ex14 {

    public static void method1() throws Exception{
        Class.forName("java.lang.NonExistClass");
    }    

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }System.out.println("クラスが見つかりません");
    }
}
