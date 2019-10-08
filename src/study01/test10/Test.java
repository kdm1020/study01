package study01.test10;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Random ran = new Random();
		int fNum = ran.nextInt(100	); //메소드의 호출.
		System.out.println(fNum);
		//System.out.println(ran);   - 주소값.
		int sNum = ran.nextInt(10);
		System.out.println(sNum);
		String str = fNum+"."+sNum;
		System.out.println(str+1);//여기서 +는 연결의 의미
		double db = Double.parseDouble(str);
		System.out.println(db+1);//여기서 +는 사칙연산에서의 합.
		
	}
}
