package study01.test11;

public class TvRemocon implements Remote{

	@Override
	public void on() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void off() {
		System.out.println("TV를 끕니다.");	
	}
	
	
}
