package study01.test13;

public class Test1 {
	private String[] strs;

	public Test1() {
		this.strs = new String[0];
	}

	public int size() {
		return this.strs.length;
	}

	public void add(String str) {
		String[] tmpStr = this.strs;
		this.strs = new String[this.strs.length + 1];
		this.strs[this.strs.length - 1] = str;
		for (int i = 0; i < tmpStr.length; i++) {
			this.strs[i] = tmpStr[i];
		}
	}

	public String toString() {
		String str = "[";
		for (int i = 0; i < strs.length; i++) {
			str += strs[i] + ",";
		}
		str = str.substring(0, str.length() - 1);
		str += "]";
		return str;
	}

	public int indexOf(String str) {
		for (int i = 0; i < strs.length; i++) {
			if (str.contentEquals(strs[i])) {
				return i;
			}
		}
		return -1;
	}

	public void remove(String str) {
		int idx = indexOf(str);
		if (idx != -1) {
			remove(idx);
		}
	}

	public void remove(int a) {
		String[] tmp = strs;

		if (a < 0 || a > strs.length) {
			for (int i = 0; i < strs.length; i++) {
				strs[i] = tmp[i];
			}
			System.out.println("remove를 다시 확인해주십시오.");
		} 
		else {
			strs = new String[strs.length - 1]; // 방개수 하나 빼고 초기화.
			for (int i = 0; i < a; i++) { // 지워진 값 기준으로 왼쪽.
				strs[i] = tmp[i];
			}
			for (int i = a + 1; i < tmp.length; i++) { // 지워진 값 기준으로 오른쪽. tmp.length==strs.length+1
				strs[i - 1] = tmp[i];
			}
		}
		/*
		 * for(int i=0;i<strs.length;i++){ System.out.println(strs[i]); }
		 */
	}

	public static void main(String[] args) {
		Test1 lt = new Test1();
		lt.add("a");
		lt.add("b");
		lt.add("c");
		lt.remove("b");

		System.out.println(lt);
		System.out.println("=====================");

		String test = "12345";

		test.substring(2);// "345"
		test = test.substring(2);// "345"
		int l = test.length() - 1;

		System.out.println(test);
		System.out.println(test.substring(0, l));// 1번방부터 끝번방 앞까지 출력.

	}

}
