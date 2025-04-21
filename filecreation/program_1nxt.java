package filecreation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class program_1nxt {
	public static void main(String[] args) {
		LocalDate le = LocalDate.now();
		System.out.println(le);
		System.out.println(le.getMonth());
		System.out.println(le.getYear());
		System.out.println(le.getDayOfMonth());
		System.out.println(le.getDayOfYear());
		System.out.println(le.plusDays(1));
		System.out.println(le.minusDays(1));
		LocalDate le1 = LocalDate.of(2025, 4, 16);
		System.out.println(le1);
		System.out.println(le.isBefore(le1));
		System.out.println(le.isAfter(le1));
		LocalTime lt = LocalTime.now();
		LocalTime lt1 = LocalTime.of(10, 55);
		System.out.println(lt.getHour());
		System.out.println(lt.getSecond());
		System.out.println(lt.plusHours(1));
		System.out.println(lt.minusHours(1));
		System.out.println(lt.isBefore(lt1));
		LocalDateTime ltd = LocalDateTime.now();
		LocalDateTime ltd1 = LocalDateTime.of(le1, lt1);
		System.out.println(ltd.plusHours(1));
		System.out.println(ltd.toLocalTime());
		System.out.println(ltd.toLocalDate());
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm"); 
		System.out.println(dtf.format(ltd1));
		}

}
