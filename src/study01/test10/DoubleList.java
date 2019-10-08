package study01.test10;

import java.util.ArrayList;
import java.util.Random;

public class DoubleList {
	
	public static void main(String[] args) {
		Random ran1=new Random(); //0~99
		
		int rNum1;
		int rNum2;
		ArrayList<String> strList = new ArrayList<String>();
		ArrayList<String> strList2 = new ArrayList<String>();
		
		for(int i=0;i<10;i++) {
			rNum1 = ran1.nextInt(100);
			rNum2 = ran1.nextInt(10);
			strList.add(rNum1+"."+rNum2); //rNum1, rNum2없이 strList.add(ran1.nextInt(100)+"."+ran1.nextInt(10)); 해도 똑같이 나옴.
			System.out.println(strList.get(i));
		}//Double을 String처럼 저장.
		System.out.println(strList);
		Random ran2=new Random();
		ArrayList<Double> doubleList = new ArrayList<Double>();
		
		System.out.println("위에는 ArrayList<String> 아래는 ArrayList<Double>");
		for(int j=0;j<10;j++) {
			strList2.add(ran2.nextInt(100)+"."+ran2.nextInt(10));
			doubleList.add(Double.parseDouble(strList2.get(j)));
			
	}
	
		System.out.println(doubleList);
		
		
	}
	

}
