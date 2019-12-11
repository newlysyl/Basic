package day02;
//필드 : 차량번호, 차량종류, 차량색깔, 최고속도, 연비
//메소드: 생성자, getter/setter, 출발, 정지, toString()
public class Car {
	private String number;
	private String type;
	private String color;
	private int maxspeed;
	private double efficiency;
	
	public Car() {
		number = "";
		type = "기본종류";
		color = "기본색깔";
		maxspeed = 0;
		efficiency = 0;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
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

	public int getSpeed() {
		return maxspeed;
	}

	public void setSpeed(int speed) {
		this.maxspeed = speed;
	}

	public double getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(double efficiency) {
		this.efficiency = efficiency;
	}
	
	
	
	public void start() {
		System.out.println("출발하다");
	}
	
	public void stop() {
		System.out.println("정지하다");
	}

	@Override
	public String toString() {
		return "Car [number=" + number +
				", type=" + type + ", color=" + color + ", maxspeed=" + maxspeed
		        + ", efficiency=" + efficiency + "]";
	}
	
}