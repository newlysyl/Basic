package day09;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

//JSON 직접 만들어보기
//JavaScipt Object Notation
public class Car {
	int id;
	private String plateNumber;
	private String type;
	private String color;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlateNumber() {
		return plateNumber;
	}
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	@Override
	public String toString() {
		//JSON에서 객체는 { }로 묶인다.
		//String value 값은 "" 로 묶는다.
		//필드 하나하나를  key 라고 부르고 실제 들어오는 값을 value라고 칭한다.
		//key는 항상 int나 String 이 될 수 있고 String일 때는 "" 로 묶는다.
		//객체하나하나를 중괄호로 묶기 때문에 객체의 수를 알 수 있음
		
		Gson g = new Gson();
		return g.toJson(this).toString();
		
		
	}
	
	
}