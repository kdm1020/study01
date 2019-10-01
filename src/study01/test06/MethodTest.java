package study01.test06;

public class MethodTest {
	public static void main(String[] args) {
		String str = "123"; // new String 생략.
		String str1 = new String("123"); // new를 쓰면 저장할 위치를 새로 만든다.
		String str2 = new String("123");

		System.out.println("123");
		System.out.println(str);
		System.out.println(str1);

		System.out.println(str == "123");// true
		System.out.println(str1 == "123");// false
		System.out.println(str == str1);// false
		System.out.println(str1 == str2);// ==는 값을 비교하는게 아니다. 저장된 '위치'를 물어보는 것.
		System.out.println(str.contentEquals(str1)); // 저장된 '값'을 비교할 때.

		int a = 1;
		int b = 1;
		System.out.println(a == b);
		
		
	}
}
