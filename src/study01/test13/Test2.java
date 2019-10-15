package study01.test13;

public class Test2 {
	private String[] strs;
	
	public Test2() {
		this.strs = new String[0];
	}
	public int size() {
		return this.strs.length;
	}
	public void add(String str) {
		String[] tmpStr = this.strs;
		this.strs = new String[this.strs.length+1];
		this.strs[this.strs.length-1]=str;
		for(int i=0;i<tmpStr.length;i++) {
			this.strs[i]=tmpStr[i];
		}
	}
	public String toString() {
		String str="[";
		for(int i=0;i<strs.length;i++) {
			str +=strs[i]+",";
		}
		str = str.substring(0,str.length()-1);
		str+="]";
		return str;
	}
	public void remove(int a) {
		String[] tmp = strs;
		if(a<0||a>strs.length) {
			System.out.println("remove를 다시 확인해주십시오.");
		}
		else {
			strs = new String[strs.length -1];
			for(int i=0;i<a;i++) {
				strs[i]=tmp[i];
			}
			for(int i=a+1;i<tmp.length;i++) {
				strs[i-1]=tmp[i];
			}
		}
	}
	public static void main(String[] args) {
		Test2 lt = new Test2();
		lt.add("abc");
		lt.add("123");
		lt.add("ㄱㄴㄷ");
		lt.remove(-1);
		
		System.out.println(lt);
				
	}

}
//배열로 List 만들어보기.