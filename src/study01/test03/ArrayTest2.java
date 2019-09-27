package study01.test03;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (i + 1) * 10; /// 10의 배수를 배열.
			System.out.println(nums[i] + ", 방번호=" + i);
			// 페이징할때 기초.
		}
	}
}
