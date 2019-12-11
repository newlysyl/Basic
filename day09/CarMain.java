package day09;

import java.util.ArrayList;

import com.google.gson.Gson;

public class CarMain {
	public static void main(String[] args) {
		Car c = new Car();
		Gson g = new Gson();
		String json = "{\"id\":3,\"plateNumber\":\"33라 3333\",\"type\":\"쉐보레\",\"color\":\"검은색\"}";
		c = g.fromJson(json, Car.class);
		System.out.println(c.getType());
	}
}
