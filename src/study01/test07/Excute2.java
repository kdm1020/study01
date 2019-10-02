package study01.test07;

class Cc {
	double a;
	double b;

	public void add() {
		System.out.println(a + b);
	}

	public void minus() {
		System.out.println(a - b);
	}

	public void multiple() {
		System.out.println(a * b);
	}

	public void division() {
		System.out.println(a / b); 
		if(b==0) {
			System.out.println("0으로는 나눌 수 없습니다.");
		}
	}

}

public class Excute2 {
	public static void main(String[] args) {
		Cc cc=new Cc();
		cc.a=4;
		cc.b=0;
		cc.add();
		cc.minus();
		cc.multiple();
		cc.division();
		

	}

}
