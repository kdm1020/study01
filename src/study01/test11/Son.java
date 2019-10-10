package study01.test11;

class Father{
	public void test() {
		System.out.println("난 아빠 테스트");
	}
}
public class Son extends Father {
	public void test() {
		System.out.println("난 아들 테스트");
	}
	public void sonsTest() {
		System.out.println("난 아빠한테 없는 기능이 있음.");
	}
	public static void main(String[] args) {
		Father ss = new Son();
		
		Son s = new Son();
		
		Son s2 = (Son)s; //형변환(캐스팅)
		Father f =new Father();
		if(f instanceof Son) {
			s2= (Son)f;
		}
		s2.sonsTest();
		
		
		s.test();
		f.test();
		ss.test();
	}

}
