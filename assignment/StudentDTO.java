package assignment;
//학생 관리 프로그램을 작성하시오
//필드 : 관리번호, 이름, 전공, 국어, 영어, 수학 점수들
//메소드는 알아서 분리하시고
//Cinema처럼 분리해서 만들어주세요.

//목표: 패키지 분리, ArrayList 사용
public class StudentDTO {
	private int id;
	private String name;
	private String major;
	private int kor;
	private int eng;
	private int math;
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
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
	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", major=" + major + ", kor=" + kor + ", eng=" + eng
		        + ", math=" + math + "]";
	}
	public boolean equals(Object o) {
		if(o instanceof StudentDTO) {
			StudentDTO s = (StudentDTO)o;
			if(this.id == s.id) {
				return true;
			}
			
		}
		
		return false;
	}
}
