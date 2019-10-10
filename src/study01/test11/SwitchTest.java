package study01.test11;

public class SwitchTest {
	public static void maing(String[] args)
	{
	int age=20;
	switch(age) {
	case 10 :
		System.out.println("10살이하");
		break;
	case 20:
		System.out.println("20살 이하");
		break;
	case 30:
		System.out.println("30살 이하");
		break;
	default :
		System.out.println("31살 이상");
		break;
	}
}}
