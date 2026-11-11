package ex01;

interface LabAction{
	void run();
}
//class welcomeAction implements LabAction{
//
//	@Override
//	public void run() {
//		System.out.println("연구소에 오신것을 환영합니다");
//		
//	}
//	
//}

public class AnonymousExample{
	
	public static void main(String[] args) {
		//1. 이름이 있는 클래스로 기능만들기
		//LabAction action = new welcomeAction(); //인터페이스는 객체 생성 못함
		//실제 구현된 LabAction의 run()메소드 실행
		//action.run();
		
		//2. 익명클래스를 이용한 기능 구현
//		LabAction action = new LabAction(){
//
//			@Override
//			public void run() {
//				System.out.println("연구소에 오신것을 환영합니다");
//			}
//		};
//		action.run();
		
		//3. 익명클래스 -> 람다함수로 바꿔서 이용한 기능구현
		LabAction action = () -> System.out.println("연구소에 오신것을 환영합니다");
	}
}