package study01.test08;

class Animal{  //Object>Animal>Dog>Jindo
	
}
class Dog extends Animal{
	public void test() {
		System.out.println("난 도그의 테스트 메소드야!");
	}
	
}
public class Jindo extends Dog{ //생성자는 생성자라 불릴 수 있는 것만!
	
	public static void main(String[] args) {
		Dog d = new Jindo();//가능
		Animal a = new Jindo();//가능
		Object o = new Jindo();//가능
		//Jindo j = new Dog();//불가능
		Dog Jindo = new Jindo();//Dog를 Animal 바꾸면 안됨.
		Jindo.test();
	}//**생활 코딩
}//하나의 클래스에 두가지 클래스를 상속받을 수는 없다.
