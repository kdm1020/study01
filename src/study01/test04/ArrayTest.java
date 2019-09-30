package study01.test04;

import java.util.Random;

public class ArrayTest {
	public static void main(String[] args) {
		int[] nums = new int[6];  //방이 만들어지면 초기에 0이 들어감.  값이 없는 것./null/의미가 없는 것.
		
		/*long l = 12345678912l;        long로 인식하게끔 뒤에 l을 붙여줘야 한다.
		double db = 1.1;
		float f1=1.1f;   float도 마찬가지.
		byte 1(byte)
		short 2
		int 4
		long 8
		char 2
		boolean 1 		*/
		Random r = new Random();
		for(int i=0;i<nums.length;i++) {  //length 는 속성. 뒤에 괄호가 없으니까.  괄호가 있으면 동작.행위 함수 method
			nums[i] = r.nextInt(45) + 1;
			for(int j=i-1;j>=0;j--) {
				if(nums[i]==nums[j]) {
					i--;
					break;    //꼭 검증해봐야함. 중복제거!!
				}   //중복제거->정렬.
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
