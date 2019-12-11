package day01;

//switch
public class Ex04 {
	public static void main(String[] args) {
		// switch는 한 변수의 나올 수 있는 값들을 모두 테스트하여
		// 해당 값이 있는 케이스문부터
		// break가 나오는 케이스까지 실행하게 된다.
		int myNumber = 1;
		switch (myNumber) {
		case 1:
			System.out.println("1입니다.");
			break;
		// break란? 만나는 즉시 해당 code block을 탈출한다.
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		default:
			System.out.println("그 외입니다.");
			break;
		}
		
		//switch문의 가장흔한 예제
		int httpStatusCode = 200;
		switch(httpStatusCode) {
		case 200:
			System.out.println("ok");
			break;
		case 404:
			System.out.println("404 Page Not Found");
			break;
		case 400:
			System.out.println("400 Bad Request");
		case 403:
			System.out.println("403 Forbidden");
			break;
		}
	}
}