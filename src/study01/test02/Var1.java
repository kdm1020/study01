package study01.test02;

public class Var1 {
	public static void main(String[] args) {
		int num1 = 1; // 변수의 선언과 초기화 //;의 명령문이 끝났을 때.
		if (num1 == 2) {
			int num2 = 10;
			System.out.println("num1은 2입니다.");
			System.out.println(num2);
		}
		/*
		 * for( int num2=1;num2<10;num2=num2+1) {//num2는 if안에 있었기 때문에 영역밖으로 나오면 다시 선언할수
		 * 있다.
		 * 
		 * }
		 */
		for (; num1 < 10; num1 = num1 + 1) {
			System.out.println(num1);
		}
		System.out.println(num1);
	}// 같은 메인 영역 안에서는 한번 선언된 변수는 바꿀 수 없다.
}
