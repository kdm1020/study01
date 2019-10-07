package study01.test08;

public class Atom{
	private void privateTest() {
		System.out.println("이건 Atom에서만 쓸 수 있는 메소드!");
	}
	
	void defaultTest() {
		System.out.println("이건 같은 패키지 안에서만 쓸 수 있는 메소드!");
	}
	
	protected void  protectedTest() {
		System.out.println("이건 같은 패키지와 상속받은 클래스 안에서만 쓸 수 있는 메소드!");
	}
	
	public void publicTest() {
		System.out.println("이건 누구나 쓸 수 있는 메소드!");
	}
}
