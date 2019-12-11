package day04;
//상속 - 01

//상속에는 2가지 개념이 있다.
//1번: 클래스 상속
//	재사용성을 위한 상속
//2번: 인터페이스 상속
//	polymorphism을 위한 상속
//		poly : 다양한
//		morph : 모양
//		ism : 성격, 주의
//		polymorphism = 다양한 모양의 성격 = 다형성

//클래스 상속은 extends 라는 명령어를 통해서 이뤄집니다.
public class Student extends Korean {
	public Student() {
		System.out.println("Student() 실행");
	}

	// overriding
	// overriding이란? 부모클래스로부터 상속받은 클래스를
	// 자식이 재정의해서 쓰는것
	// 자식클래스가 오버라이딩 하면 해당 메소드는 자식클래스의 메소드가 실행된다.
	// overriding 하면 더 이상 부모클래스의 메소드는 사용할 수 없게 된다.
	public String toString() {
		return "Student클래스의 toString()메소드";
	}
	// 단 오버라이딩 할때는
	// 부모클래스의 메소드 선언부와 완전히 동일해야한다.
	// 다르면 오버라이딩이 아니라 '오버로딩'이 된다.

	public void eat() {
		System.out.println("급식을 먹는다.");

	}
}