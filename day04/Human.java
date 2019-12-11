package day04;
//인터페이스란?
//상속을 통해서 메소드를 강제한다.
//인터페이스 안에서는 메소드를 '선언'만 하고
//실질적인 내용은 상속받는 클래스에서 구현하게 된다.
public interface Human {
	public void speak();
	
	//human을  상속받는 클래스는 speak 메소드를 가지게된다.
}
