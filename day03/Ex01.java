package day03;

import java.util.Scanner;

//스캐너 버그
public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("회원번호: ");
		int userId = scanner.nextInt();
		System.out.println("회원이름: ");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("번호: " + userId);
		System.out.println("회원이름: " + name);
		
		scanner.close();
		//엔터를 입력종료로 인식하므로
		//버퍼메모리를 비워줘야한다.
		//그래서 스캐너.넥스트라인을 한번더 실행시켜준다
		//그 결과 버퍼메모리가 비워져서 새로 쓰기 가능
		//결론은 숫자 입력 다음에 문자입력인 경우 scanner 한번더 실행해줘야함
	}
}