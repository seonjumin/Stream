package ex01;

import java.util.List;

public class MonsterTest {

	public static void main(String[] args) {
		//1. 몬스터 목록 객체 생성
		List<Monster> monsters = List.of(
			new Monster("슬라임", "일반", 3, 100, "물",0),
			new Monster("불꽃이", "희귀", 8, 200, "불",0),
			new Monster("버섯돌이", "일반", 5, 180, "풀",0),
			new Monster("꼬마드래곤", "전설", 20, 1500, "불",0),
			new Monster("얼음토끼", "희귀", 12, 700, "얼음",0),
			new Monster("돌멩이", "일반", 2, 80, "땅",0)
		);
		
		//2. 몬스터 목록크기 알기
		System.out.println(monsters.size());
		
		//3. 첫번째 몬스터 이름 알아보기
		System.out.println(monsters.get(0) // List안의 0번째 객체 얻음	
							.getName());
		
		System.out.println("------------------------------------");
		//1. 몬스터 리스트 데이터 처리
		// 스트림이용
		monsters.stream()
//		.filter(monster -> monster.getLevel() >= 10)
//		.filter(monster -> monster.getGrade().equals("희귀"))
//		.forEach(monster -> System.out.println(monster.getInfo()));
		.map(monster -> monster.getName())
		.sorted()
		.forEach(name -> System.out.println(name));
		
		long totalCount = monsters.stream().count();
		System.out.println(totalCount);
		
	}

}
