package study01.test06;

public class MethodTest2 {

	public static void main(String[] args) {
		String str = "0123456";
		int idx = str.indexOf("10");// 배열에 저장되지 않는 index를 찾으면 -1로 출력됨. ex)345라고 적어도 3의 index 자리가 나옴.
		System.out.println("10은 str의 " + idx + " index자리에 있네요.");// index 배열의 방 번호.
		// indexOf 는 자주 쓰임.★

		String name = "경훈,선호,영현,종서,동민,혜영";
		String[] strs = name.split(","); // ,를 기준점으로 배열을 생성. 보통 기준점으로 ,를 잘 안씀.|도 썼었음.
		for (int i = 0; i < strs.length; i++) {
			System.out.println("이름 : " + strs[i]);

		}
	}
}
