package study01.test07;

public class ArrayTest {
	public static void main(String[] args) {
		String[] strs = new String[5];
		//null과 0과 빈문자열은 다르다.
		//try,catch문 찾아보기.
		
		for(int i=0;i<strs.length;i++)
		{
			strs[i]=(i+1)*10+""; //뭐든지 문자를 +하면 문자로 인식한다.
		}
		for(int i=0;i<strs.length;i++)
		{
			System.out.println(strs[i]);
		}
		
	}
}
