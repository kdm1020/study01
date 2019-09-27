package study01.test03;

public class Increment {
	// 증감연산자
	public static void main(String[] args) {
		int num = 1;
		num = num + 1; // 증가시키는 첫번째 방법. 잘 안씀.
		num += 1; // 증가시키는 두번째 방법. num+=1과 num=num+1은 같다. 1보다 큰 수를 더할때는 이 방법.
		num++; // 증가시키는 세번째 방법. 1씩 더할때는 이방법. ++은 후순위 연산자.(예를들어서 출력에 적으면 출력을 하고 더함.)++을 앞에다 적을수도
				// 있음.
		System.out.println(num++); // 후순위라 4가 찍히고 5로 계산됨.
		System.out.println(num);

		num = num - 1;
		num -= 1;
		num--;
		System.out.println(num--); // 후순위라 2가찍히고 1로 계산됨.
		System.out.println(num);
		System.out.println("-----------------------------------------");

		for (int i = 1; i <= 10; i++) { // for문은 도입부 ; 조건부 ; 증감부로 구성. 이 구성이 없어도 동작은 하지만, 최대한 지켜주는 쪽으로!!
			System.out.println(i); // i값은 11까지 올라가지만 찍히는 것은 10까지.
		}

	}
}
