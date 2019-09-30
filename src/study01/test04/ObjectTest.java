package study01.test04;

import java.util.Random;

public class ObjectTest {
	int age;
	String name;
	Random r;

	String getStr() {
		return null; // "getStr 라는 함수입니다.";
	}

	public static void main(String[] args) {
		ObjectTest ot = new ObjectTest(); // 이 라인에서 자동으로 age값에 0이 들어감.=>0으로 초기화.
		System.out.println(ot.age);
		System.out.println(ot.name); // 정해져 있지 않은 데이터값의 초기값은 null이다.★ new 변수명();
		System.out.println(ot.r);
		// System.out.println(ot.r.nextInt()); // 컴파일 exception?
		ot.age = 10; // age값 10으로 초기화.

		System.out.println(ot.age);
	}

}
/*상속
 *
 * 
 * 
 * 
 */
