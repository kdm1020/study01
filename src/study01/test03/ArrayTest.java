package study01.test03;

public class ArrayTest {

	public static void main(String[] args) {
		// 디자인 패턴-반복되는 문제에서 반복되는 문제를 해결하는 것.//★mvc패턴 Model View Control.
		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (i + 1)*2; //짝수만 넣음or 2의 배수만 넣음.
			
			System.out.println(nums[i] + "," + i); // 입력값과(num[i]) 방번호(i).
			
		}
	}
}
