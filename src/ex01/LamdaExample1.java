package ex01;

import java.util.function.Consumer;

public class LamdaExample1 {

	public static void main(String[] args) {
		Consumer<String> greeting = name -> 
			System.out.println(name + "님, 반갑습니다.");
				
		greeting.accept("지우");
	}
}
