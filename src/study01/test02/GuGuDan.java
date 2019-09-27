package study01.test02;

public class GuGuDan {

	public static void main(String[] args) {
		for(int num = 1; num<10; num=num+1) {
		int max = 10;
		System.out.println(num+"단 시작~");
		for (int i = 1; i < max; i = i + 1) {
			System.out.print(num + "X" + i + "=" + (num * i) );
		if(i<(max-1)) {
			System.out.print(",");
			}
		}
		System.out.println();
		
		
		
		}
	}
}
