package sample01;
public class Test02 {
	public static void main(String[] args) {
		int a =10;
		char b ='c';
		double c = 20;  
		String d ="apple";    // d 라는 변수명이 있고 가질 수 있는 변수는 문자열이다. 
		System.out.println(a+10);   // =은 뒤에 있는 결과를 앞에 저장하는 대입연산자
		System.out.println(d+10);  // 문자열 연결자 / *자료형에 따라서 사용되는 연산자가 다르다.*
		c=a+10/2;    			// 연산자의 우선순위를 판단
		System.out.println(a+10);
		int k = a+a/4;
		System.out.println(k);
		int cc=a;
		a=a/3+2;
		cc=cc+a;
		System.out.println(cc);
		a=10;
		double p = 4;
		System.out.println(a/p); 	// 정수/실수 형변환
		System.out.println(a==10);	// 비교 연산자 T/F 값으로 떨어짐
		System.out.println(a!=10);  // != 같지 않다 == 같다
		// a의 value는 10입니다.
		System.out.println(a=a+1);
		System.out.println(a==10);
		//위 두줄의 코드를 다음과 같이 하나로 줄일 수 있다.
		System.out.println((a=a+1)==10);
	}
}

