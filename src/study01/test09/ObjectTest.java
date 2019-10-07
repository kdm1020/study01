package study01.test09;

public class ObjectTest {
	
	int num1;
	static int num2;  //이태릭체는 변수가 스태틱일때.	뉴오브젝트를 해도 스태틱은 삭제되지 않는다. 메인 메소드가 끝날때까지 안사라짐.
	
	public static void main(String[] args) {//메인은 반드시 static으로 고정?해야한다.
		ObjectTest ot = new ObjectTest();
		ot.num1 =10;
		System.out.println(ot.num1);
		System.out.println(num2);//0
		ot.num2 = 10;
		ot = new ObjectTest();
		System.out.println(num2);//3
		
		String str1="1";
		String str2 = new String("1");
		
		System.out.println(str1==str2);//저장공간이 서로 다르므로 false
		
		}

}
