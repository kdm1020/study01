package study01.test15;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest2 {
	
	public static void main(String[] args) {
		Map<String,String> map =new LinkedHashMap<String,String>();
		map.put("선호음료수1","밀크티");
		map.put("선호음료수2","커피");
		map.put("선호음료수3","녹차");
		map.put("선호음료수4","쵸코우유");
		map.put("선호음료수5","오렌지쥬스");
		map.put("선호음료수6","홍차");
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key : "+key+", value : "+map.get(key) );
		}
	
	}
}
