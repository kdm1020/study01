package study01.test10;

class FF{

}
public class FinalTest extends FF{

	final int NUM = 1;
	public static void main(String[] args) {
		final int A = 3;  //고정값. final 붙은 상수는 더이상 변환 불가, 반드시 초기화를 같이 해주어야 한다. 보통 public, static이랑 같이 씀. 전체를 대문자로 씀.
		int num=3;
		String str= "넘은 3이 맞습니다.";
		
		str=(num==3)?"넘은 3이 맞습니다.":"넘은 3이 아닙니다.";
		System.out.println(str);//삼항 연산자.
		FinalTest ft = new FinalTest();
		System.out.println(str instanceof String);
		System.out.println(ft instanceof FinalTest);
		FF ff = new FinalTest();
		System.out.println(ff instanceof FinalTest);
		ff = new FF();
		System.out.println(ff instanceof FinalTest );
	}
}
