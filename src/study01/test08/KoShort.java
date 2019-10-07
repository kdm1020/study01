package study01.test08;

class Cat{
	public void sleep() {
		System.out.println("고양이가 잡니다.");
	}
}
public class KoShort extends Cat{
	public void sleep() {
		System.out.println("코숏 고양이가 잡니다.");
	}

	public static void main(String[] args) {
		Cat ks = new KoShort();//Cat에서 KoShort으로 덮어써서 KoShort이 호출됨.
		//Cat에서 Object로 바꾸면 실행이 안됨.(오브젝트에는 sleep이 없으니까.)
		ks.sleep();//오버 라이딩.
		//========================================
		Cat[] cats= new Cat[4];
		cats[0]=new Cat();
		cats[1]=new KoShort();
		
		cats[0].sleep();
		cats[1].sleep();
	}
}
