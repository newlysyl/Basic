package day02;

public class Student {
	// 접근제한자
	// 접근 가능한 범위를 지정한다.
	// public : 어디서든지 접근 가능(같은 프로젝트 내부면)
	// protected : 같은 패키지 + 상속받는 클래스까지 접근 가능
	// package : 같은 패키지에서만 상속가능 (아무것도 안 적어주면 package. 즉, default는 package와 같은 레벨이다.)
	// default : package와 같은 레벨
	// private : 같은 클래스에서만 접근 가능

	// private으로 된 필드듣은 더 이상 외부에서 값을 불러오거나 저장할 수 없다.
	// 따라서 method를 통하여 값을 저장하거나 불러오게 된다.
	// 그러한 method들을 getter/setter라고 부른다.
	// getter/setter들은 get필드이름, set필드이름으로 이름 짓는다.

	private String name;

	// getter: 필드에 저장된 값을 호출된 곳으로 넘겨준다.
	public String getName() {
		return name;
	}

	// setter: 외부의 값을 필드에 저장한다.
	public void setName(String name) {
		this.name = name; // this는 필드의 name이고, = 뒤의 name은 넘어온 파라미터임
	}

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	private int kor;

	private int eng;

	private int math;

	private String jumin;

	public void study() {
		System.out.println("공부합니다!");

	}

	public void connectToMySql() {
		System.out.println("MySql 연결!");
	}

	public void sing() {
		System.out.println("서울고등학교 교가를 부른다.");

	}

	public void goToSchool() {
		System.out.println("서울고등학교로 갑니다.");
	}
	
	public void goToSchool(String schoolName) {
		System.out.println(schoolName+"고등학교로 갑니다.");
		
	}

	/*
	 * public void goToSchool(String studentName) {
	 * System.out.println(studentName+"가 학교로 갑니다.");
	 */
	public int add(int a, int b) {
		return a + b;
	}
	
	public double add(double a, double b) {
		return a + b;
	}
		
		
	// 메소드 선언방법:
	// 접근제한자 리턴타입 메소드이름(파라미터)
	// 접근제한자 : 해당 메소드나 필드가 어디서부터 접근 가능한지 정해준다.
	// 리턴타입 : 메소드가 끝난 후 호출 된 곳으로 보내줄 값의 데이터타입
	// 메소드이름 : 호출될때 사용될 이름
	// 파라미터 : 이 메소드에서 필요로하는 외부의 값.
	// 파라미터는 데이터타입 파라미터이름으로 이루어지는데
	// 파라미터 이름은 외부에서 보내줄 변수의 이름과 일치할 필요가 없다.
	// 다만 메소드 내부에서는 파라미터의 이름으로 쓰이게 된다.

	// void는 아무것도 리턴해주지 않는다.
	// 메인메소드는 main. 보통 메소드는 소문자나 동사
	public boolean equals(Object o) {

		// equals(object o) 를 쓰게 되면 자바의 모든 클래스에 파라미터를 줄 수 있게된다.
		// 모든 객체를 뜻하는 object o
		// 또한 object o 는 모든 클래스의 조상을 의미함.
		if (o instanceof Student) { // instanceof 는 왼쪽이 오른쪽의 객체인지 확인하는 역할
			Student s = (Student) o;
			// 위의 식은 형변환(Type casting)임. 즉 o를 스튜던트로 만들고 s에 담은것
			if (this.jumin.equals(s.jumin) && // 여기서 this는 이 메소드를 호출할 객체를 의미함.
			        this.name.equals(s.name)) {
				return true; // 둘다 성립하면 true 출력
			}
		}
		return false;

	}
	
	//생성자 (Constructor)
	//생성자란? 해당 객체가 초기화될때 실행되는 메소드
	//주로 필드의 초기화를 담당한다.
	//우리가따로 만들어주지 않아도
	//자바가 기본적으로 제공하는 생성자가
	//필드의 값들을 초기화하는데
	//필드의 데이터타입이 기본형이면 0
	//데이터타입이 참조형이면 null로 초기화된다.
	
	//그러면 생성자를 만들어봅시다.
	//생성자는 리턴타입이 없다.
	public Student() {
		name = "기본생성자가 생성한 이름";
		age = 1;
		kor = 0;
		eng = 0;
		math = 0;
		jumin = "기본생성자가 생성한 주민번호";
	}
	
	//생성자는 파라미터가 있을 수 있습니다.
	public Student(String name, int age, int kor, int eng, int math, String jumin) {
	
	}
	//override란?
	//자식 클래스가 재정의해서 사용하는것
	
	//overload란?
	//같은 이름의 메소드지만
	//파라미터 내용이 다른 메소드로서
	//기능은 비슷하게 돌아간다
	//예를 들면 생성자 오버로딩이 있다.
	
	public String toString() {
		return "[name:"+name+", jumin:"+jumin+"]";
		
	}
}