package study01.test14;

/*interface Test{
	static void print1() {
		System.out.println("난 인터페이스의 print1()");
	}
	default void print2() {
		
	}
}*/
//인터페이스는 몸통을 가지려면 static, default 2가지 방법이 있다.
class End{
	/*final*/ void test() {
	System.out.println("난 test 메소드");
	}
}
final class End2{

}
//메소드에 final을 쓸때는 절대로 바꾸면 안될때.(오버라이딩을 못하게 함)
//class에 final을 쓸때는 상속을 못하게 함.
//final 을 어디에 쓰느냐 따라서 상속이 안되고, 이 메소드를 재규정 할수 없다. 강력하게 규정을 만들때 사용한다.
public class Start extends End{
	static final String STR_EXAM = "abc";
	void test() {//메소드에 final을 적어서 에러.
		//System.out.println("난 start's test메소드");
	}
	public static void main(String[] args) {
		
	}
}
