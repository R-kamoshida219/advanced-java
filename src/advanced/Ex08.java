package advanced;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Ex08 {
public static void main(String[] args) {
    LocalDate localDate = LocalDate.of(2020,02,01);
    
    LocalDate lastDay =localDate.with(TemporalAdjusters.lastDayOfMonth());

    System.out.println(lastDay.getDayOfMonth());
}
}
