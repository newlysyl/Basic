package day02;

public class StudentExx {
	public static void main(String[] args) {
		Student s = new Student("가나다", 17, 90, 80, 70, "991111-1111111");
		
		System.out.println(s.getName());
		System.out.println(s.getAge());
		Student s2 = new Student();
		System.out.println(s2.getName());
	}
}
