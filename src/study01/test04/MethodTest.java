package study01.test04;

public class MethodTest {
	static int num = 1;
	//실행부는 클래스 바로 밑에 영역에서는 실행되지 않는다.  선언과 실행은 다르다.
	//같은 영역에서 같은 변수명으로 두 번 선언할 수 없다.
	static int num() {
		return 1;
	}
	public static void main(String[] args) { // method는 괄호 열기,닫기. method는 무조건 class안에(영역) 있어야한다!!변수도 마찬가지.
		System.out.println(num);
		
	}

}
