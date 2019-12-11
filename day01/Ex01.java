package day01;

import java.util.Scanner;


// 화면에 Hello World!! 를 출력하세요.
public class Ex01 {
	public static void main(String[] args) {
		//public은 접근제한자 . 이 클래스내에서 메소드에 접근하는것을 가능하게 해줌
		//static 해당 메소드를 객체에 참조메모리에 올릴 필요 없이 곧장 메소드 등록
		//void 이 메소드가 실행되고나서 호출된 곳에 아무런 값도 return 하지 않겠다
		//main 은 메소드 이름
		
		System.out.print("Hello World!!");
		
		//1. 자바의 명명규칙 1 -> camel back notation (낙타등 표기법)
		int userNumber; //낙타등 표기법의 예시
		
		//2. 자바의 명명규칙 2 -> 변수명은 소문자 시작+명사
		
		//3. 자바의 명명규칙 3 -> 클래스의 변수 (=객체) 는 한번만 쓰이는 경우가 많다.
		//그럴때에는 첫글자를 소문자로 하고, 클래스 이름은 그대로 따라간다.
		Scanner scanner = new Scanner(System.in); //(스캐너 클래스의 스캐너 객체)
		
		//4. 자바의 명명규칙 4 -> 클래스는 대문자로 시작하는 명사
		
		//5. 자바의 명명규칙 5 -> 메소드는 소문자로 시작하는 동사
		
		//6. 자바의 명명규칙 6 -> 상수는 모든 글자가 대문자(단어사이 공백은 _로 한다)
		
		//상수란? 처음 초기화한 값이 고정된다. 바꿀 수 없게 된다.
		final double PI = 3.141592;
		final int USER_SIZE = 20;
		
	}
}