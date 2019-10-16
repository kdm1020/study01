package study01.test15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("치킨","맥주");
		map.put("삼겹살", "소주");
		map.put("파전","막걸리");
		
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key : "+key);
			String value = map.get(key);
			System.out.println("value : "+value);
		}
	}
}
