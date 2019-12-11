package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//로또번호 제작기 - 2단계
public class Ex02 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random random = new Random();
		while(list.size() < 6) {
			Integer randomNumber = random.nextInt(45)+1;
			if(!list.contains(randomNumber)) { // list에 randomNumber 가 없을때 if문 실행
				list.add(randomNumber);
			}
		}
		for(int i : list) {
			System.out.println(i);
		}
		
		//굳이 sort 하지말고 자바에 있는 sort를 쓰면 됨 
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println("======정렬후======");
		for(int i : list) {
			System.out.println(i);
		}
	}
}