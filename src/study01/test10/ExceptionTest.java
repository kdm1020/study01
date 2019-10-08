package study01.test10;

public class ExceptionTest {

	public static void main(String[] args) {
		
		
		String strNum="일이삼사";
		try {
		int num = Integer.parseInt(strNum);
		}
		catch(Exception e) {
			System.out.println(strNum+"(는)은 숫자가 아닙니다.");
		}
		finally {
			System.out.println("무조건 실행되는 영역.");
		}
		//System.out.println(num); 이거 왜 실행 안됨??
	}
}
