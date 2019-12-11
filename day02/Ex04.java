package day02;

import java.util.ArrayList;

//배열
//배열이란? 같은 데이터타입이 모여있는 것
public class Ex04 {
	public static void main(String[] args) {
		//배열 선언하기
		//데이터타입[] 배열이름 = new 데이터타입[크기]
		int[] arr = new int[5];
		//int가 5개 모여있는 배열 arr 이란 뜻이 된다.
		
		//배열의 각 요소를 접근할때는
		//배열이름[인덱스번호]로 접근한다.
		//인덱스번호는 0부터 크기-1 까지이다.
		arr[0] = 5;
		arr[1] = 10;
		arr[2] = 20;
		arr[3] = 40;
		arr[4] = 80;
		
		//배열의 값 쭉 출력하기
		for(int i : arr) {
			System.out.println(i);
		}
		
		//배열의 단점 1번:
		//안의 요소가 어떻게 있는지 확인하기 어렵다.
		//예를 들자면 arr 중 어디가 값이 안들어가있는지 찾으려면
		//모든 요소를 다 봐야한다.
		System.out.println(arr.length);
		//arr.length를 찍어보면 내가 무슨 값을 넣어도
		//항상 배열의 총 크기인 5만 나오게 된다.
		
		//배열의 단점 2번:
		//크기가 고정이다.
		//배열의 크기보다 작은 용량을 쓰면 큰 문제가 없어보이지만
		//배열의 크기보다 더 큰 용량을 쓰려고 하면?
		int[] temp = new int[5];
		for(int i = 0; i < 5; i++) {
			temp[i] = arr[i];
		}
		arr = new int[10];
		for(int i = 0; i < temp.length; i++) {
			arr[i] = temp[i];
		}
		
		//배열의 단점 3번:
		//정렬이 어렵다.
		//정렬도 위의 단계를 거쳐서
		//하나씩 정렬해줘야한다.
		
		//배열의 단점 4번:
		//내가 원하는 객체를 찾기도 어렵다.
		//그런 단점들을 해결한게
		//List 인터페이스를 상속받는 클래스들이다.
		//가장 대표적인 클래스로는 ArrayList가 있다.
		System.out.println("---ArrayList---");
		
		//ArrayList는
		//template을 통해 어떤 클래스 객체가 들어올지 정해주게 된다.
		//기본형 데이터타입들은 wrapper class로 감싸서 넣어주게 된다.
		ArrayList<Integer> list = new ArrayList<>();
		
		//ArrayList에 값을 추가할때:
		//add method를 사용한다.
		Integer i = 5;
		list.add(i);
		Integer i2 = 10;
		list.add(i2);
		Integer i3 = 100;
		//특정 위치에 객체를 추가할 때는
		//add(위치의 인덱스번호, 객체) 로 추가해준다.
		list.add(1, i3);
		
		//list의 객체를 삭제할때에는
		//2가지 방법이 있다.
		//같은 객체를 찾아서 삭제하는 방법과 원하는 위치의 값을 삭제하는 방법
		list.remove(0);
		list.remove(i3);
		
		//indexOf 메소드는
		//모든 요소에 대해 equals() 메소드를 실행해서
		//첫번째로 true가 나오는 index 번호를 리턴한다.
		System.out.println(list.indexOf(10));
		
		//만약 없는 객체를 indexOf에 넣으면?
		//-1이 나오게 된다.
		//즉 , -1이 나온다는 의미는 해당 객체는 리스트에 없다는 것
		System.out.println(list.indexOf(i3));
		
		
		//해당 리스트에 객체가 있는지 확인할때에는
		//contains 메소드를 실행한다.
		//만약 있으면 true가 나오고 없으면 false가 나온다.
		System.out.println(list.contains(10));
		
		//리스트의 모든 내용을 삭제할 때에는 clear()를 사용한다.
		list.clear();
		
		
		for(Integer integer: list) {
			System.out.println(integer);
		}
	}
}