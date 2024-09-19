package _10_Class;

import java.util.Random;

public class _Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		Random r = new Random();  // 객체를 만든 코드
		Random r1 = r;			// r 은 객체의 주소이다. 위의 변수와 아래의 변수는 하나의 객체를 참조하고 있다.
		Random r2 = null;		// r3는 random 이라는 객체의 주소를 저장하는 것인데 아직 객체의 주소가 없다는 뜻
		Random r3 = new Random();
		
		// 여기서 객체는 2개이다. 
		// 원시변수는 1개 참조변수는 4개
		// 원시변수: 실제 내가 저장하고 싶은 값
		// 참조변수: 객체가 있는 곳의 주소
		
		// 위에서 잘못된 코드는? : r2이다. 이유는 객체를 참조할 주소가 없다.
		System.out.println(r.nextInt(4));
		System.out.println(r1.nextInt(4));
		System.out.println(r2.nextInt(4));	// .은 참조한다는 뜻인데 참조할 주소가 없으니 에러가 난다.
		System.out.println(r3.nextInt(4));
		
	}
}