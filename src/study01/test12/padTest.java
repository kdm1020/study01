package study01.test12;

public class padTest {
	
	public static void main(String[] args) {
		String str= "1";
		int max = 4-str.length();
		for(int i=1;i<=max;i++) {
			str += "0";
			System.out.println(str);
		}
		
	}

}
