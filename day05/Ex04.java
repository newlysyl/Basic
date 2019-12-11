package day05;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//collection
//Map
public class Ex04 {
	public static void main(String[] args) {
		//mapping이란?
		//그 단어가 몇번 나왔는지 카운트
		//우리가 했던 collection 객체들은 polymorphism 을 적용시킬 수 있다.
		Map<String, String> map = new LinkedHashMap<String, String>();
		
		//map에 데이터를 저장할때에는 key와 value를 put 메소드에 담아서 저장한다.
		map.put("key 1번", "value 1번");
		map.put("key 2번", "value 2번");
		
		//map의 저장된 데이터를 불러올때에는 key 값으로 불러오게 된다.
		System.out.println(map.get("key 1번"));
		
		//map에 저장을 할 때 key는 key set에 저장이 된다.
		//즉 중복된 key 값은 허용되지 않는다. (덮어씌워진다.)
		for(String s : map.keySet()) {
			System.out.println(s);
		}
		
		//만약 우리가 map key값과 value값을 전부 출력하고 싶다면?
		for(String s : map.keySet()) {
			System.out.println("key: "+ s + "value" + map.get(s));
	}
}

}