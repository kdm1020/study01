package study01.test02;

public class ArrayTest {
	public static void main(String[] args) {
		int money1 = 0;
		int money2 = 100;
		int money3 = 500;
		int money4 = 1000;

		int[] moneys = new int[4];
		moneys[0] = 0;
		moneys[1] = 100;
		moneys[2] = 500;
		moneys[3] = 1000;

		System.out.println(moneys.length);// A.B은 'A의B'라는 의미를 가짐.

		for (int i = 0; i < moneys.length; i=i+1) {
			System.out.println(moneys[i]);
		}
	}
}
