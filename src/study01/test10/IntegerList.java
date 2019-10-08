package study01.test10;

import java.util.ArrayList;

public class IntegerList {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();//시작점을 만들어준다 생각. 
																								//<>안써도 동작. default가 Object로 됨. 이때는 소숫점 문자 다 들어감.
		al.add(10);
		al.add(20);
		al.add(30);
	
		for(int i=0;i<al.size();i++) {
		System.out.println((i)+"번째 방 : "+al.get(i)); 
		}
		System.out.println(al);//리스트 출력
	}
}
