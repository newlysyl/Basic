package day04;

import java.util.Scanner;

//로그인 시스템 만들기
//사용자로부터 id와 비밀번호를 받아서
//회원가입 -> 로그인
//id 4글자 이상 13글자 미만
//pw 6글자 이상
//로그인 시에는 id와 비밀번호 둘중 하나만 틀려도
//정확히 뭐가 틀렸는지는 말하지않고
//id혹은 pw가 틀렸습니다
//라고 출력이 되고
//둘다 맞을 시에는 "로그인 성공!" 이란 메시지가 출력되도록 만들기
public class Ex04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("가입할 아이디를 입력하세요.");
		String id = scan.nextLine();
		System.out.println("사용할 패스워드를 입력하세요.");
		String pw = scan.nextLine();

		if (id.length() >= 4 && id.length() < 13 && pw.length() >= 6) {
			System.out.println("Login System");
			System.out.println("아이디를 입력하세요.");
			String userId = scan.nextLine();
			System.out.println("패스워드를 입력하세요.");
			String userPw = scan.nextLine();
			if (id.equalsIgnoreCase(userId) && pw.equals(userPw)) {
				//equalsIgnorecase는 대소문자 상관없이 문자열이 같은지 확인
				System.out.println("로그인 성공!");
			} else {
				System.out.println("아이디 혹은 패스워드를 잘못 입력하셨습니다.");
			}

		}
	}
}