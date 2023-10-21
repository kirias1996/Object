package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateSample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String str = dateTime.format(formatter);
        System.out.println(str);
//        System.out.println(dateTime);
//
//        LocalDateTime nextWeek = dateTime.plusWeeks(1);
//        System.out.println(nextWeek);
	}

}
