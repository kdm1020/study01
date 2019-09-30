package study01.test04;

public class MethodTest2 {

	static void test() { // 메소드 선언 영역o //void = 아무것도 return하지 않겠다.
		System.out.println(1);
	}

	// 실행은 9번 밑으로.
	static int getNum() {
		return 0;
	}

	public static void main(String[] atgs) {
		test(); // 메소드 호출 영역x
		int a = getNum(); // int형 데이터타입에 대입할수 있다.

	}
}
