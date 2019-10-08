package study01.test08;

class Father{
	int a=3;
	Father(){
		System.out.println("1.난 아빠클래스의 생성자임!");
	}
}
//생성자의 기본조건 - 클래스명의 대소문자까지 같아야한다. 리턴값이 없다. 
//메소드와 상당히 비슷하다.
public class ConstructorCC extends Father{
	int b=10;
	 ConstructorCC(){
		System.out.println(b);
		System.out.println(a);
		System.out.println("2.난 생성자 클래스의 생성자임!");
	}
	public static void main(String [] args) {
		Father f = new Father();//오류가 나지 않는 이유는 '기본생성자'가 안보이지만 4번라인에 있어서이다.
		ConstructorCC c = new ConstructorCC();//파더클래스에 있는걸 우선적으로 읽고 생성자클래스로 넘어옴.
	}
}//오버라이딩과 오버로딩 확실히 인지하고 구별하기.//같은 영역인지, 상속관계인지 파악이 중요.
