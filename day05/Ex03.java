package day05;

import java.util.Random;
import java.util.TreeSet;

//로또번호 제작기 3
//Set
public class Ex03 {
	public static void main(String[] args) {
		//Set이란?
		//List처럼 Collection 인터페이스이다.
		//Set은 기본적으로 중복값을 받아들이지 않기 때문에 우리가 중복인지 아닌지를 체크할 필요도 없다.
		//hashset, linkedHashSet, TreeSet
		//3가지가 있는데
		//지금은 TreeSet 사용
		//TreeSet은 자동정렬까지 해준다.
		TreeSet<Integer> set = new TreeSet<>();
		Random random = new Random();
		while(set.size() < 6) {
			set.add(random.nextInt(45)+1);
		}
		
		for(int i : set) {
			System.out.println(i);
		}
	}
}