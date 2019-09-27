package study01.test03;

public class Compare {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;

		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		System.out.println(num1 < num2);
		System.out.println(num1 > num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 >= num2);              // 비교 연산자.
		boolean isSame = num1 == num2;
		System.out.println(isSame);
	}
}
