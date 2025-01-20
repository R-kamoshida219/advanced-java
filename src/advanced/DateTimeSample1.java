package advanced;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeSample1 {
public static void main(String[] args) {

    // ⽇付を表すクラス
   LocalDate localDate = LocalDate.now(); //確認

   System.out.println("現在の日付:" + localDate);

   // 時間を表すクラス
   LocalTime localTime = LocalTime.now();
   System.out.println("現在の時間:" + localTime);

   // ⽇付と時間
   LocalDateTime localDateTime = LocalDateTime.now();
   System.out.println("現在の日付と時間:" + localDateTime);
}
}
