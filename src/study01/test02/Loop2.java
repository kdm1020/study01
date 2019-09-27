package study01.test02;

public class Loop2 {
	
	public static void main(String[] args) {
		int max = 10;
		int a; // a는 i를 2로 나눈 나머지값
		for (int i = 1; i <= max; i = i + 1) {
			a = i % 2;
			if (a == 0) {
				System.out.println(i);
			}
		}
	}
}
