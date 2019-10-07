package study01.test08;

public class Overloading {
	//전제 조건 : 같은 영역에서 같은 메소드명을 가져야한다. 파라메터의 갯수가 다르거나 위치가 달라야한다.
	//
	public void a() {
		
	}
	
	public int a(int a) {
		return 1;
	}
	
	public void a(int a, String s) {
		
	}
	
	public void a(String a) {
		
	}
	
	public void a(String s, int a) {
		
	}
}
