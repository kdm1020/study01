package study01.test07;

public class ObjectTest {

	int a;// 멤버 변수=클래스 영역 안에 있으나, 다른 영역 안에는 포함 되지 않은 것.(파란색 색상.)

	public void test() {
		int a = 1;
		System.out.println(a);
		System.out.println(a);
	}

	public void test2() {
		// 클래스 안에 클래스 가능. 클래스 안에 메소드 안에 클래스 가능. 메소드 안에 메소드는 안됨. 구분하기!
		System.out.println(a);
		System.out.println(a);
//실행 왜 안됨?
	}
}
