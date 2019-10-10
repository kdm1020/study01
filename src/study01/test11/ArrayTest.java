package study01.test11;

public class ArrayTest {

	public static void main(String[] args) {
		int[][] nums = new int[4][];   //뒤에는 입력하지 않아도 된다.
		nums[0] = new int[3];
		System.out.println(nums[0][1]);
		nums[1] = new int[10];
		System.out.println(nums[0].length);
		System.out.println(nums[1].length);
		
		
	}
}
