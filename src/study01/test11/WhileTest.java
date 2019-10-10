package study01.test11;

import java.util.ArrayList;

public class WhileTest {

	public static void main(String[] args) {
	
		int i=1;
		for(i=1;i<=10;i++) {
			System.out.println(i);
		}
		i=1;
		while(i<=0) {
			System.out.println(i);
		}
		
		ArrayList<String> strList = new ArrayList<String>();
		while(strList.size()<7) {
			strList.add("암거나~");
		}
		do {//무조건 한번은 실행함
			strList.add("암거나~");
		}while(strList.size()<7);
	}
}
