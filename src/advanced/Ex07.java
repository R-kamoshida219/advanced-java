package advanced;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex07 {
public static void main(String[] args) {
    LocalDate localdate = LocalDate.of(1998,2,19);
    DateTimeFormatter formatter 
    =DateTimeFormatter.ofPattern("yyyy年MM月dd日");
    String format = localdate.format(formatter); 
    System.out.println("私の誕生日は" + format + "です");

}
}
