package ex01;

import java.util.List;

public class ChainExample {

	public static void main(String[] args) {
		// 1. 과일목록 준비
		// 과일은 3개이므로 List.of 메서드 사용
		List<String> names = List.of("banana","apple","cherry");
		
		// 2. 과일목록 스트림 생성
		names.stream()
		// 3. 'a'가 포함되었는가?
		.filter(name -> name.contains("a"))
		// 4. 대문자고쳐서 맵을 만든다.
		.map(name -> name.toUpperCase())
		// 5. 순서정렬을 한다.
		.sorted()
		// 6. 과일목록의 각각의 이름을 출력
		.forEach(name -> System.out.println(name));
	}

}
