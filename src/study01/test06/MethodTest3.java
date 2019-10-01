package study01.test06;

public class MethodTest3 {
	int num;
	
	int getNum() {
		
		System.out.println(num);//오류안남. 이때 num 바로 위에 있는 num을 따라 온다. 4번라인 num출력
		int num=3;
		System.out.println(num);//출력값 3 //9번라인 num출력
		System.out.println(this.num);//출력값 0 //4번라인 num 출력
	
		return 1;
	}

	public static void main(String[] args) {
		MethodTest3 mt3 = new MethodTest3();  //<=이 시점에서 0으로 초기화.
		mt3.getNum();
		
		/*
		 * 1.모든변수와 모든 method는 혼자서 존재할 수 없다. 변수든 method는 반드시! 어떤 영역 안에 들어가야 한다.
		 * 2.method는 반드시 class안에서만 선언된다. 
		 * class바로 밑영역에서만.(class내에 있는 영역에서는 선언되지 않는다. ex)method안에 method선언 X)
		 * 3.변수는 class 안, method안 둘 다 선언 할 수 있다. class안에만 있다면 어디든 선언 가능하다!
		 * But, 같은 영역안에서 같은 변수명으로는 두 번 선언이 불가능하다.
		 */
		
		
	}
}
