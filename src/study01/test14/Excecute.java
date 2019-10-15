package study01.test14;

import java.util.ArrayList;
import java.util.List;

public class Excecute {

	public static void main(String[] args) {
		List<Person> pList = new ArrayList<Person>();
		Person p = new Person();
		p.setName("박도영");
		p.setAge(24);
		p.setAddr("안양");
		pList.add(p);
		p=new Person();
		p.setName("하늘");
		p.setAge(24);
		p.setAddr("인천");
		pList.add(p);
		//p = pList.get(0);
		p.setName("재빈");
		System.out.println(pList.get(0));
		System.out.println(pList.get(1));
		
		System.out.println(pList);
		
	}
}
