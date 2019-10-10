package study01.test11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapTest {
//해쉬맵, 링크드해쉬맵  //맵은 키밸류가 있음.
	public static void main(String[] args) {
		HashMap<String, String> human = new HashMap<String, String>(); // 키에 대한 데이터타입 정의와, 벨류에 대한 데이터타입 정의가 둘다 이루어져야한다.
		human.put("이름", "홍길동");  //key,value
		human.put("나이", "33");
		human.put("주소", "서울 강서구");
		human.put("성별", "남자");
		human.put("성별", "여자");//성별에 덮어씀.

		
		System.out.println(human.get("이름"));
		System.out.println(human);
		
		List<HashMap<String,String>> people = new ArrayList<HashMap<String,String>>();
		
		people.add(human);
		people.add(human);
		//human.put("이름","임꺽정");
		human = new HashMap<String, String>(); 
		System.out.println(human);//human은 기존에 있던 HashMap에서 새로만들어진 HashMap을 바라봄.
		System.out.println(people);//people은 그대로입력된 데이터를 바라봄. 
		System.out.println(people.get(0));
		
	}

}
