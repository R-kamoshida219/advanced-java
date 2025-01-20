package advanced;

public class Ex05 {
public static void main(String[] args) {
    String bigNumber = "阿僧祇(あそうぎ):那由他(なゆた):不可思議(ふかしぎ):無量大数(むりょうたいすう)";
    String[] parts = bigNumber.split(":");
   

    for(int i=0; i < 5;i++){
    System.out.println(parts[i]);
    }
}
}
