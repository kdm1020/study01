package study01.test07;

public class Cons {
	int num;

	public Cons() {
		System.out.println("아! 내가 호출되었구나.");
	}

	public Cons(int num) {
		System.out.println("아! num파라메터가 있는 날 호출하였구나!");
	}

	public static void main(String[] args) {
		Cons c = new Cons();// Cons()-생성자 : 메소드의 성격을 그대로 가지지만 return type X.
							// 접근제어자 protected 빼고 다됨. class명과 동일해야한다. 오버라이딩 X.
							//무언가를 시작하기 전에 선행되어야 할 로직이 있을때 생성자를 쓴다.
							//생성자를 따로 만드는 순간 기본 생성자는 만들어 지지 않는다.
		System.out.println(c.num);
		
	}
}
