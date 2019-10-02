package study01.test07;
//간단한 계산기 만들기.
class Calc{
	private int num1;
	private int num2;

	public Calc(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	public void add() {
		System.out.println(num1+num2);
	}
	public void minus() {
		System.out.println(num1-num2);
	}
	public void multiple() {
		System.out.println(num1*num2);
	}
	public void division() {
		System.out.println(num1/num2);   //유효성 검사. num2가 0이 되면 안되기 때문에.
	}
}

public class Execute {
	
	public static void main (String[] args) {
		Calc calc=new Calc(4,2);
		calc.division();
		/*calc.num1=5;
		calc.num2=2;
		calc.add();
		calc.minus();
		calc.multiple();
		calc.division();*/
		
		/*
		 * Calc calc=new Calc(); //Clac라고 불리는 메모리를 만듦.
		calc.num1=5;
		calc.num2=3;
		calc.add();
		Calc calc2 = new Calc();
		calc2.add();  아래부터는 배열변수로 바꿔보자.
		*/
		/*
		 * Calc[] calcs = new Calc[3];  //각 방에는 0이 아니라 null이 들어감.
		calcs[0] = new Calc(); //여기를 지우면 오류는 안나지만 실행시 NullPointerException 발생. 꼭 배열의 방안에 값을 입력해야함.
		calcs[0].add();
		*/
		
	}

}
