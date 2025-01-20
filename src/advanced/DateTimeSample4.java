package advanced;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeSample4 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        System.out.println("現在の日付：" + localDate);
        System.out.println("月末は" + localDate.with(TemporalAdjusters.lastDayOfMonth()));
  

//時間を表すクラス
    LocalTime localTime = LocalTime.now();
    System.out.println("現在の時間：" + localTime);

// LocalTimeは⽉の情報がないため使⽤できない
// System.out.println("⽉末は"+ localTime.with(TemporalAdjusters.lastDayOfMonth()));

// ⽇付と時間
LocalDateTime localDateTime = LocalDateTime.now();
System.out.println("現在の日付と時間：" + localDateTime);
System.out.println("月末は"+ localDateTime.with(TemporalAdjusters.lastDayOfMonth()));

}
}
