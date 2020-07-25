package st4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		// 現在の日時をDate型で取得
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		// 取得した日時情報をCalendarにセット
		c.setTime(now);
		// Calendarから「日」の情報を取得
		int day = c.get(Calendar.DAY_OF_MONTH);
		// 取得した値に100を足して、Calendarの日にセット
		day += 100;
		c.set(Calendar.DAY_OF_MONTH, day);
		// Carendarの日付情報をDate形に変換
		Date future = c.getTime();
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		System.out.println(f.format(future));
	}

}
