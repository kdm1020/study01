package study01.test11;

interface promise{
	void test();  //인터페이스는 default선언을 하지 않으면 기본값으로 public을 가진다.
	public int test1(); 	//인터페이스는 접근제어자 public만 된다, 아직은.
}

public class Interface extends Father implements promise{//상속관계가 아니라 인터페이스를 토대로 '구현하겠다'는 의미로 implements사용.
	//반드시 오버라이딩을 해야한다. 오버라이딩은 리턴타입도 같아야 한다.
	public void test() {
		
	}
	public int test1() {
		return 1;
	}
	public void test2() {//파더클래스의 test2는 디폴트지만 오버라이딩으로 퍼블릭 가능.//퍼블릭이 더 크니까. private<protected<default<public
		
	}

}
