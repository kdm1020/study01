package study01.test05;

import study01.test04.PrivateTest;

public class PublicTest {
	public int num;
	
	
	public static void main(String[] args) {
		PublicTest pt = new PublicTest();
		System.out.println(pt.num);
		PrivateTest pt2 = new PrivateTest();  //같은 패키지가 아니라 다른곳에 있을때는 알려줘야한다.
		System.out.println(pt2.num);  //private일땐  안 됨.나만되기 때문에. default는 가능.  ★접근제어자. public-protected-default-private
															//protected는 같은패키지에서도 쓸수있고 다른패키지라도 상속받으면 쓸 수 있다.
				
	}
}
