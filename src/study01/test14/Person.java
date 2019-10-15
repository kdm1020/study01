package study01.test14;

public class Person {
	private String name;
	private int age;
	private String addr;
	
	public void setName(String name) {
		this.name = name;  ///this가 붙은 name은 4번라인, 안붙은건 8번 라인.
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAddr() {
		return addr;
	}
	public String toString() {
		return "Person [name="+name+",age="+age+",addr="+addr+"]";
	}
}//get-set 메서드
