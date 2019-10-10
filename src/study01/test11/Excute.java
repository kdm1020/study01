package study01.test11;


public class Excute {

	public static void main(String[] args) {
		Remote r = new TvRemocon();//데이터 타입으로 사용 가능.
		r.on();
		Remote r2 = new AirconRemocon();
		r2.on();
		
	}
}
