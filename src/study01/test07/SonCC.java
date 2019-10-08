package study01.test07;

class Mother{
	public void cook() {
		System.out.println("재료가 없으니 물에 밥 말아 먹어라.");
	}
}
public class SonCC extends Mother {
	public void cook() {
		super.cook();//Mother cook 실행.
		System.out.println("물밥 지겹다. 라면을 끓여 먹겠다.");
	}//★오버라이딩. 위에를 무시하고 아래를 실행한다.-우선순위 번경
	
	public static void main(String[] args) {
		SonCC s = new SonCC(); //Son()은 생성자 역할.
		s.cook();
		
	}
}
