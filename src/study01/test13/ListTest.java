package study01.test13;

import java.util.ArrayList;

public class ListTest {
	private String[] strs;
	
	public ListTest() {
		this.strs = new String[0];
	}
	public int size() {
		return this.strs.length;
	}
	public void add(String str) {
		String[] tmpStr = this.strs;
		this.strs=new String[this.strs.length+1];   //strs앞에 this.붙여도 되고 안붙여도 된다.
		this.strs[this.strs.length-1]= str;
		for(int i=0;i<tmpStr.length;i++) {
			this.strs[i]=tmpStr[i];
		}
	}
	
	
	public static void main(String[] args) {
		ListTest lt=new ListTest();
		lt.add("a");
		lt.add("b");
		lt.add("c");
		
		
		
		System.out.println(lt.size());
		System.out.println(lt.strs[0]);
		System.out.println(lt.strs[1]);
		System.out.println(lt.strs[2]);
		System.out.println(lt.strs[0]+","+lt.strs[1]+","+lt.strs[2]);

	
		
	}//메서드는 정해져 있지 않은 데이터 타입에만 붙일 수 있다.
}
