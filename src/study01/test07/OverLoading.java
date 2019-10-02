package study01.test07;

public class OverLoading {
	public void test() {
		System.out.println("test()메소드 호출!");
	}
	public void test(int num) {
		/*여기 괄호()에 들어가는 것을 파라메터라고 부름. 여러개 넣을 수도 있다.
		 * 파라메터의 개수가 같고 타입이 같을때 위치만 바꿔도 된다.ex int , String --String, int
		 * 오버로딩 메소드명 같고, 파라메터 달라야 하고.
		 * void는 리턴값을 지정하지 않아도 된다.*/
		System.out.println("test(int num)메소드 호출1");
	}
	public void test(String str) {
		System.out.println("test(String)str method call!");
	}
	public void test(String str, int num) {
		System.out.println("test(String, int num)str method call!");
	}
	public static void main(String[] args) {
		OverLoading ol =new OverLoading();
		
		ol.test();
		ol.test(1);//int
		ol.test("");//String
		ol.test("",1);//String,int
		
	}
}
