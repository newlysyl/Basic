package day05;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//D-day 계산기
public class Ex07 {
	public static void main(String[] args) {
		// 사용자로부터 연월일을 입력받아서
		// 오늘날짜 기준 D-day를 계산해준다.
		Scanner scan = new Scanner(System.in);
		System.out.println("계산할 년: ");
		int year = scan.nextInt();
		System.out.println("계산할 월: ");
		int month = scan.nextInt();
		System.out.println("계산할 일: ");
		int day = scan.nextInt();

		LocalDateTime dDay = LocalDateTime.of(year, month, day, 0, 0);
		LocalDateTime today = LocalDateTime.now();
		
		Duration d= Duration.between(today, dDay);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy년-M월-d일");
		System.out.println(
				dDay.format(DateTimeFormatter.ISO_DATE) + "까지 "
						+d.toDays()+"일 남았습니다.");

		scan.close();
	}
}
