package study01.test05;

class Father {
	void work() {//상속
		System.out.println("아버지가 일을 하십니다.");
	}
}

public class Son extends Father {
	void work() {//상속 거부 - 오버라이딩??이라고 함.
		System.out.println("나도 일을 한다.");
	}

	public static void main(String[] args) {  //args = arguments
		Son s = new Son();
		s.work();
	}

}
