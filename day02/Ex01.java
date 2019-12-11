package day02;

import java.util.Scanner;

//while loop
public class Ex01 {
	public static void main(String[] args) {
		//while문은
		//괄호 안에 조건식이 들어가고
		//false가 나올때까지 반복된다.
		int i = 10;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("비트 성적관리 프로그램");
			System.out.println("1. 입력   2. 출력   3. 종료");
			System.out.println("> ");
			int choice = scanner.nextInt();
			if(choice == 3) {
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}
		}
		int j = 0;
		do {
			System.out.println(j);
			j--;
		}while(j>0);
		while(j>0) {
			System.out.println(j);
		}
	}
}
