package study01.test06;

public class ObjectTest {
	int num1;
	int num2;
	String str = ""; //new String("");로 바꾸면 23번 라인이 false가 나온다.
	

	public static void main(String[] args) {
		ObjectTest ot = new ObjectTest(); 
		ot.num1 = 5;
		ot.num2 = 10;
		System.out.println(ot.num1);
		System.out.println(ot.num2);
		ot = new ObjectTest();  //다시 초기화. 덮어 쓰는게 아니라 새로 위치가 생성된다.
		ObjectTest ot2 = new ObjectTest(); 
	
		System.out.println(ot.num1);
		System.out.println(ot.num2);
		System.out.println(ot2.num2 == ot.num1);  //정해져 있는 데이터타입은 같다...? ★시험에 나옴!
		//ot2.str=""; 적어도 true 나옴.
		//ot2.str = new String(""); false가 나옴. new String으로 직접 새로 만들어져서.
		System.out.println(ot.str==ot2.str);//true 출력. ot에서 이미 공백으로 저장되어져서 ot2에서 따로 저장 안함?!
	}
}
