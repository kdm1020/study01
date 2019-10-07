package study01.test09;

import study01.test08.Atom;

public class Inherit extends Atom {  //컨쉬O
	
	public static void main(String[] args) {

		Inherit i = new Inherit(); //i.defaultTest(); 이건 안됨.
		i.protectedTest();
		System.out.println(i);
		Object o=new Inherit();
		System.out.println(o);
	/*	Object obj =1;
		obj="1";
		obj = true;
		obj = new Scanner(System.in);
		obj =  new Atom();
		obj = new Inherit();*/
		
		}//※toString 찾아보기
	}


