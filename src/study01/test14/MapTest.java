package study01.test14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>(); // 엑셀의 열
		List<HashMap<String, String>> mapList = new ArrayList<HashMap<String, String>>();   // 엑셀의 행 *List는 인터페이스다.
		Random r = new Random();
		
		for(int i=0;i<10;i++) {
			map = new HashMap<String,String>();
			int age=r.nextInt(30)+1;
			map.put("이름", "홍길동"+i);
			map.put("나이", age+"");
			map.put("성별", "남자");
			if(i%2==0) {
				map.put("성별","여자");
			}
			mapList.add(map);			
		}
		
		for(int i=0;i<mapList.size();i++) {
			System.out.println(mapList.get(i));
		}
		
		
	
		
	
		//System.out.println(mapList); //이름,나이,성별 다 출력된다. 따로 초기화가 더이상 진행되지 않았기 때문이다.   []는 list  {}는 map.
		// HashMap<String,List<HashMap<String,String>>> totalMap; //엑셀의 시트

	}
}
