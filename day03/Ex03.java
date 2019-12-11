package day03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("월을 입력");
		int month = scan.nextInt();
		
		
		switch(month) {
			case 1:
			case 2:
			case 3:
			case 12:
			case 11:
				System.out.println("겨울");
				break;
			case 4:
			case 5:
				System.out.println("봄");
				break;
			case 6:
			case 7:
			case 8:
			case 9:
				System.out.println("여름");
				break;
			case 10:
				System.out.println("가을");
				break;
		}
	}
}
