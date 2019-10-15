package study01.test14;

class Son extends AbstractTest{
	public void test() {
		System.out.println("test");
	}
}

public abstract class AbstractTest {

	public abstract void test();
	//body{}가 있어야 하는건, main에서 new를 하기위해서 이다. 
	//만약 body를 만들지 않고, abstract 추상클래스로 만들면 대신 new를 할수 없다.
	//무조건 상속을 받은 클래스에서만 new를 할 수가 있다.
	public static void main(String[] args) {
		AbstractTest at = new Son();//new AbstractTest는 안되지만, new Son은 상속을 받아서 사용 가능하다.
		at.test();
	}
}
