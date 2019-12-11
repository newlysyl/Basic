package day01;

import java.util.Calendar;

//자바 연산자들
//산술 논리 비트 비교 증감
public class Ex02 {
	public static void main(String[] args) {
		//기본형 데이터타입
		//byte short  int  long  float double char boolean
		//8bit 16bit 32bit 64bit 작은실수   큰실수      문자    참/거짓
		//기본형 vs 참조형
		//해당 메모리 위치에 실제값이 들어가면 기본형
		//해당 메모리 위치에 실제값이 아니라 heap 영역 메모리 주소값이 들어가면 참조형
		//기본형과 참조형 데이터타입의 차이 : 기본형은 메모리주소에 데이터값을 그대로 가짐. 참조형은 메모리주소값에 해당 클래스의 정보
		//산술 : + - * / %
		int number1 = 5;
		long number2 = 10;
		Ex02 e = new Ex02();
		Calendar calendar = Calendar.getInstance();
		System.out.println(number1);
		System.out.println(e);
		System.out.println(calendar);
		
		//논리 : boolean 값에 대한 연산 -> &&(and), ||(or), !(반전)
		//&& : and 연산 -> 2개 값이 모두 true 일때만 true가 됨
		//|| : or 연산 -> 2개 값 중 하나만 true여도 true가 됨
		//! : 반전연산 -> true는 false로, false는 true로 바꿈
		boolean isTrue = true;
		boolean isFalse = false;
		System.out.println(isTrue && isFalse); //isFalse가 false니까 결과는 false가 됨
		System.out.println(isTrue || isFalse);
		System.out.println(!isTrue || isFalse); //isTrue가 false가 되고 , isFalse || isFalse 이므로 결과는 false가 됨
		
		//비트 : 2진법 숫자에 대한 연산
		// & | ^ ~ << >>
		byte myByte = 3;  //00000011
		byte myByte2 = 4; //00000100
		//& 연산 : 2진법으로 변환 후 두 숫자의 같은 자리가 모두 1이면 1
		System.out.println(myByte & myByte2);
		//| 연산 : 2진법으로 변환 후 두 숫자의 같은 자리 중 하나가 1이면 1
		System.out.println(myByte | myByte2);
		//^ 연산 : 2진법으로 변환 후 두 숫자의 같은 자리 값이 다르면 1
		System.out.println(myByte ^ myByte2);
		//~ 연산(부정연산) : 0은 1로, 1은 0으로
		System.out.println(~myByte); //11111011
		// << 연산(쉬프트연산) : 왼쪽 쉬프트 연산. 자릿수를 왼쪽으로 이동시킨다.
		System.out.println(myByte << 2);
		//0000 0011 << 2
		//0000 001100 -> 10자리 but 8비트는? 8자리
		//앞에 2자리는 지워준다.
		//즉 0000 1100
		// >> 연산(쉬프트연산) : 오른쪽 쉬프트 연산. 자릿수를 오른쪽으로 이동시킨다.
		System.out.println(myByte >> 2);
		//0000 0100 >> 2
		//0000 0001 00 인데 오른쪽 두자리 00은 지워준다.
		myByte2 = -10;
		//1000 0101
		System.out.println(myByte2 >> 2);
		//1111 1101
		System.out.println(myByte2 >>> 2);
		//1111 0110
		//1111 1101 10
		
		
		
		//컴퓨터에선 2진법 숫자의 제일 앞자리는 부호를 뜻한다.
		//0이면 +, 1이면 -
		//또한 숫자체계가 직선이 아닌 원형체계 이기 때문에
		//0111 1111 + 1은 1000 0000 이 되면서 음수 최솟값으로 바뀐다.
		//이러한 숫자체계 때문에 양수 최댓값에 +1 이 음수 최솟값으로 바뀌는것을 overflow
		//음수 최솟값에 -1 이 양수 최댓값으로 바뀌는것을 underflow라고 한다.
		
		//강제로 overflow 경험해보기
		System.out.println((byte)128);
		
		//강제로 underflow 경험해보기
		System.out.println((byte)-129);
		
		
		//비교 : 크거나 작거나 같은 비교
		//> >= < <= == != (6가지)
		System.out.println(myByte > myByte2);
		
		//클래스의 비교
		String string1 = "abc"; //이 경우는 ""를 통해 임시로 abc라는 객체를 만드는것
		String string2 = new String("abc"); 
		String string3 = "abc";
		//string1,3은 abc의 임시주소값. string2는 생성자를 불러서 새로 초기화를 한것이므로 주소값이 틀리게됨
		//1과 3은 주소값이 똑같지만 2는 다르다.
		
		System.out.println(string1 == string2);
		System.out.println(string2 == string3);
		System.out.println(string1 == string3);
		System.out.println(string1.equals(string2));
		
		//증감 : ++ --
		//int 같은 기본형 데이터값을 1씩 증가시키거나 감소시킴
		int myNumber = 5;
		System.out.println(myNumber++);
		//System.out.println(myNumber)하고
		//myNumber++가 실행되서 5가 6이 된다.
		System.out.println(myNumber);
		System.out.println(++myNumber);
		//++myNumber가 실행되서 6이 7이 되고
		//System.out.println(myNumber)이 실행되서
		//7이 화면에 출력이 된다.
		System.out.println(myNumber);
		
	}
}
