package ex17collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex06HashMapMain {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();
		
		/*
		겍체저장 : 객체저장시 기존에 저장된 동일한 Key값이 존재하면 저장된 객체가
			반환된다. 만약 처음 입력이라면 null을 반환한다. 
		*/
	
		System.out.println("name이라는 키값으로 저장된 이전의 값:"+ 
				map.put("name", "홍길동"));
		
		/* int형은 String으로 변환할 수 없으므로 타입에러가 발생한다. */
		int number = 20;
//		map.put("age", number);
		//정수는 아래와 같이 문자열로 변경한 후 저장할 수있다.
		map.put("age", String.valueOf(number));
		map.put("gender", "남자");
		map.put("address", "가산디지털단지");
		//4개의 데이터가 저장됨.
		System.out.println("저장된 객체수:"+ map.size());
		
		/*
		중복저장 : 기존에 입력된 Key값 name이 이미 있으므로 '홍길동'이 반환된다.
			기존의 값은 '최길동'으로 수정된다.
		*/
		System.out.println("name이라는 키값으로 저장된 이전의 값:"+ 
				map.put("name", "최길동"));
		//중복저장되므로 4개가 출력된다.
		System.out.println("키값으로 중복 저장후 객체수:"+ map.size());
		
		/*
		출력하기
			1.키값을 알고있을때 : get(key값)으로 출력한다.
		*/
		System.out.println("키값을 알때:"+ map.get("name"));
		
		/*
			2.키값을 모를때(혹은 키값이 너무 많아서 하나씩 명시하기 힘들때)
			: KeySet()을 통해 전체 Key를 Set컬렉션으로 얻어온다.
			해당 반환값을 확장 for문을 통해 반복하고, 이를 통해 Value를 
			추출할 수 있다. 
		*/
		Set<String> keys = map.keySet();
		System.out.println("[확장 for문 적용]");
		for(String key : keys) {
			String value = map.get(key);
			System.out.println(String.format("%s:%s", key, value));
		}
		
		/*
			3. 이터레이터를 통한 출력
		*/
		System.out.println("[이터레이터 사용하기]");
		//Map의 전체 key를 얻어온 후
		Set<String> keys2 = map.keySet();
		//key를 통해 이터레이터를 생성한다.
		Iterator<String> it = keys2.iterator();
		//key가 있는지 확인한 후
		while(it.hasNext()) {
			//존재하면 key를 얻어온다.
			String key = it.next();
			//key를 통해 value를 추출한다.
			String value = map.get(key);
			System.out.println(String.format("%s:%s", key, value));
		}
		
		/*
		value만 얻어올때는 values() 메서드를 통해 값을 추출할 수 있다.
			그리고 확장 for문을 통해 출력한다.
		*/
		System.out.println("[value값들만 출력하기]");
		Collection<String> values = map.values();
		for(String value : values) {
			System.out.println(value);
		}
		
		/*
		존재 유무 확인
		*/
		System.out.println(map.containsKey("name") ?
				"name키값있다" : "name키값없다");
		System.out.println(map.containsKey("account") ?
				"account키값있다" : "account키값없다");
		System.out.println(map.containsKey("남자") ?
				"남자 있다" : "남자 없다");
		System.out.println(map.containsKey("여자") ?
				"여자 있다" : "여자 없다");
		
		/*
		삭제
		*/
		System.out.println("삭제된객체:"+ map.remove("age"));
		System.out.println("[age키값을 삭제후 출력]");
		for(String key : keys) {
			System.out.println(String.format("%s:%s", 
					key, map.get(key)));
		}
		
		/*
		전체삭제
		*/
		map.clear();
		System.out.println("전체삭제후 객체수:"+ map.size());
	}
}
