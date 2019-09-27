package study01.test03;

import java.util.Scanner;

public class HowOldRU {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // ctrl+shitft+o를 꼭 입력.
		System.out.println("너 몇살이야?");
		String age = scan.nextLine();
		System.out.println("난" + age + "살 이야~"); // IO 인풋 아웃풋
		int num = Integer.parseInt(age); // <=입력받는 age를 문자에서 숫자로 변경. **parse 분석.
		// 10살 이하면 어린이, 20살 이하면 청소년, 40살 이하면 청년, 그 이상이면 꼰머.
		if (num <= 10) {
			System.out.println("삐빅. 어린이입니다.");
		} else if (num <= 20) {
			System.out.println("삐빅. 청소년입니다.");
		} else if (num <= 40) {
			System.out.println("삐빅. 청년입니다.");
		} else {
			System.out.println("삐빅. 꼰머입니다.");
		}

	}
}
