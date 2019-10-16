package study01.test15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//배열을 플렉시블하게 쓰려고 만든게 List
public class MapTest {

	public static void main(String[] args) {
//		String str="2019-10-16";
//		System.out.println(str.replace("-","."));
//		str=str.replace("-", ".");
//		System.out.println(str);    //replace하는방법.
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("선호음식1", "치킨");
		map.put("선호음식2","초밥");
		map.put("선호음식3","쌀국수");
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key : "+ key);
			String value = map.get(key);
			System.out.println("value : "+value);
		}
		
		
		  System.out.println(map);
		 		
	}
}
