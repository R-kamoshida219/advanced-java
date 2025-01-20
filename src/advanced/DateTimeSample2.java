package advanced;

import java.time.LocalDateTime;

public class DateTimeSample2 {
public static void main(String[] args) {

    LocalDateTime localDateTime = LocalDateTime.of(2018,1,2,3,4,5,999999999);
    System.out.println("日付と時間" + localDateTime);

   int month = localDateTime.getDayOfMonth();
   System.out.println("月：" + month);
   int dayOfMonth = localDateTime.getDayOfMonth();
   System.out.println("日：" + dayOfMonth);
   int hour = localDateTime.getHour();
   System.out.println("時:" + hour);
}
}
