package study01.test13;

public class Test1 {
	private String[] strs;
	
	public Test1(){
		this.strs = new String[0];
	}
	public int size() {
		return this.strs.length;
	}
	public void add(String str) {
		String[] tmpStr=this.strs;
		this.strs = new String[this.strs.length+1];
		this.strs[this.strs.length-1]=str;
		for(int i=0;i<tmpStr.length;i++) {
			this.strs[i]=tmpStr[i];
		}
	}
	
	public static void main(String[] args) {
		Test1 lt = new Test1();
		lt.add("a");
		lt.add("b");
		lt.add("c");
		System.out.println(lt.strs[0]+","+lt.strs[1]+","+lt.strs[2]);
		
	}

}
