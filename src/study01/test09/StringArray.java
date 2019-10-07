package study01.test09;

import java.util.ArrayList;
import java.util.Random;

public class StringArray {

	public static void main(String[] args) {
		/*String[] strs = new String[10];
		// 입력부
		Random ran = new Random();
		for (int i = 0; i < strs.length; i++) {
			int rNum = ran.nextInt(20) + 1;
			strs[i] = rNum + "";// ★string에 숫자를 넣는 방법->+문자("")를 하면 다 문자로 인식됨!!
		}
		// 출력부. --나누는 이유는 구분할려고?
		for (int i = 0; i < strs.length; i++) {
			//System.out.println(strs[i]);
		}
		 */
		
		ArrayList<String> strList = new ArrayList<String>();//<>안에 String이 빠져도 무관.  유동적으로 사이즈 조절이 가능하다. 어차피 기반은 배열이다. 정해져있는 데이터타입은 첫글자를 대문자로 변환해서 넣는다. 
		strList.add("홍길동");
		strList.add("임꺽정");
		strList.add("박문수");
		strList.add("김문수");
		//strList.remove(1);//방을 없애버림.
		//System.out.println(strList.size());
		System.out.println("==우리반 출석부==");
		for(int i=0;i<strList.size();i++) {
			System.out.println((i+1)+". "+strList.get(i));
		}
		System.out.println("박문수는 "+(strList.indexOf("박문수")+1)+"번째에 있어요.");
		
		ArrayList<Integer> numList = new ArrayList<Integer>();//Integer 대신 Object를 넣어도 된다.
		numList.add(1);
		numList.add(2);
		numList.add(3);
		System.out.println(numList);
		
	}// map과 list의 가장 큰 차이점은 열과행 '카테고리?'를 바꿔도 무관한가.
//class를 만드는 이유: 나중에 다시 쓰려고
}
