package study01.test11;

public class ContinueTest {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i%2==0)continue;//8번 라인으로 가지않고 바로 증감부로 감. 
			System.out.println(i); //홀수 출력.
		}
	}
}
