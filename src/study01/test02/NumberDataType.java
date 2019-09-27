package study01.test02;

public class NumberDataType {
	
	public static void main(String[] args) {
		
		byte b = 127;//제일 작음.
		short s = 128;//바이트보다 큼.
		int i = 100000;//쇼트보다 큼. 가장 빠름. 가장 많이 씀.
		long l = 10000000;//정수 저장할 수 있는 거에서 제일 큼.
		
		double d = 1;//float보다 큼. 가장 많이 씀.
		float f;
		f = 0.1f;//플롯 저장시에는 뒤나 에 f를 붙임. 거의 볼 일 없음.
		
		/*
		 * byte b = 1;
		 * short s=b;
		 * b=1; 가능
		 * b=s; 불가능
		 */
	}
}
