package study01.test10;

import java.util.ArrayList;
import java.util.Random;

public class Sort {

	public static void main(String[] args) {
		Random ran = new Random();
		ArrayList<Double>doubleList = new ArrayList<Double>();
		ArrayList<Double>st =new ArrayList<Double>();
		ArrayList<String> strList = new ArrayList<String>();
	//난수로 리스트 생성.
		for(int i=0;i<10;i++) {
			strList.add(ran.nextInt(100)+"."+ran.nextInt(10));
			doubleList.add(Double.parseDouble(strList.get(i)));
		}
	//오름차순 정렬파트.
		for(int i=0;i<doubleList.size();i++) {
			for(int j=i+1;j<doubleList.size();j++) {//j=i+1과 j=1 둘다 상관없나?
				if(doubleList.get(i)>doubleList.get(j)) {//요기부터 다시 확인.
					double tmpDouble = doubleList.get(i);
					doubleList.set(i,doubleList.get(j));
					doubleList.set(j,tmpDouble);
				}
			}
		}
		//출력.
		System.out.println(doubleList);
		

	}
}//ArrayList 순서대로 입력받고, 출력받는 것 중에 가장 빠름.<>안에 명시적으로 오브젝트를 써주자.	


















