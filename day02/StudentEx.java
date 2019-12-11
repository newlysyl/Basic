package day02;

public class StudentEx {
	public static void main(String[] args) {
		Student s = new Student(); //new를 통해 확보된 공간에 name, age등의 정보를 넣는다.
		
		s.setName("가나다");
		s.setAge(17);
		s.setKor(80);
		s.setEng(100);
		s.setMath(70);
		s.setJumin("991212-1000000");
		System.out.println(s.getName());
		//만약 값들이 database에서 나왔다면?
		
		s.study();
		s.sing();
		s.connectToMySql();
		s.goToSchool();    //메소드에 정의되어있는 내용을 그대로 쓰게 된다.
		
		//객체는 클래스변수이다. 
		
		Student s2 = new Student();  //s와 s2는 다른 객체이다.(처음 생성될 때 들어가는 위치도 다르고, 들어가 있는 필드의 값도 다르다.)
		s2.age = 16;				//단, 어디에 선언되었던간에 ★★필드값이 같으면 s1,s2은 같은 객체이다.★★
		s2.name = "가나다";			//★★ 즉, 같은 클래스에서 나온 객체가 필드값이 같다면 같은 객체이다. ★★
		s2.kor = 80;
		s2.eng = 90;
		s2.math = 100;
		s2.jumin = "991212-1000000";
		s2.study();
		s2.sing();
		s2.connectToMySql();
		s2.goToSchool();
		s.equals(s2);
		
		String str = "abc";
		System.out.println(s.equals(str)); //str은 string객체이므로 이 결과는 false가 나온다.
	}
}