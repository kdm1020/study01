package study01.test07;
//get-set method
class Cat {
	private int age;// 느낌표는 warning
	private String name;
	private String type;
	// POJO (Plain Old Java Object)옛날방식 그대로의 자바를 사용하자.
	// 변수는 무조건 private로 선언한다.
	public void setAge(int age/* 이 공간은 선언만 할수있다 */) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
}//set은 '값만' 입력하는거-그래서 void..
//set method에는 로직을 집어넣지 않는다!  //주입을 했으면 가져오는게 있어야한다. set-get.//입력부와 출력부가 따로 있다.
public class Access {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.setAge(5);
		c.setName("나비");
		c.setType("코숏");

		System.out.println("나이 :" + c.getAge() + "살 이름 :" + c.getName() + " 종 :" + c.getType());
	}
}
