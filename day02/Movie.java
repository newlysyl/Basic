package day02;

// Spring식으로 표현하면
// 테이블 하나당 3개의 클래스가 나오게 된다.
// 1.데이터를 담는 클래스 (Data Transfer Object/ Value Object)
// 2.DB와 통신을 담당하는 클래스 (Controller)
// 3.화면으로 쏴주는 클래스 (Viewer)
// 이렇게 Model - View - Controller 로 분리해서 개발하는 패턴을
// MVC 패턴이라고 한다.
// 유지보수가 쉬워서 (뷰어만 손보면 되는) MVC패턴을 쓴다.
// 모델, 뷰어, 컨트롤러 따로따로 분리해서 유지보수 가능하다.

public class Movie {
	//클래스 설계해보기
	//클래스를 설계할 때 중요한것은
	//어떤 필드를 구성하고
	//또 그 클래스가 어떤 메소드를 실행할지를 고민해야한다.
	
	//필드를 구상할 때는
	//제일먼저 int id 를 선언하여
	//관리번호를 가질 수 있게 한다.
	private int id;
	private String title;
	private int length;
	
	
	public int getId() {
		return id;
	}
	
	//getter, setter
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	//toString()
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", length=" + length + "]";
	}
	
	//기본생성자
	public Movie() {
		id= 0;
		title= "";
		length= 0;
	}
	
	//메소드의 경우
	//toString()과 같은 기본 생성자는 꼭 만들어주는것이 좋다.
}	