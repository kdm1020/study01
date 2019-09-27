package study01.test02;

public class Var2 {
	int a = 1; /// 메인영역밖에는 선언만 할 수 있다. 실행은 못 한다.
	public static void main(String[] args) {//시작점.
		int a = 3;
		System.out.println(a);
		// 선언과 실행은 다르다. 선언 외에는 실행이다.
	}
}
