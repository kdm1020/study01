package study01.test11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTest {
	// List가 ArrayList의 인터페이스이다.
	public static void main(String[] args) {
		List<String> strList1 = new ArrayList<String>();
		List<String> strList2 = new LinkedList<String>(); // 앞뒤를 안다!? 변형,추가,삭제를 해야 할 경우 ArrayList보다 효율적이라 사용한다.
		strList1.add("1");
		strList1.add("2");
		strList1.add("3");
		strList2.add("1");
		strList2.add("2");
		strList2.add("3");

		System.out.println(strList1);
		System.out.println(strList2);

		strList1.remove(0);
		strList2.remove(0);

		System.out.println(strList1);
		System.out.println(strList2);

		strList1.set(0, "4");
		strList2.set(0, "4");
		System.out.println(strList1);
		System.out.println(strList2);
		System.out.println(strList1.size());
		System.out.println(strList2.size());

	}
}
