package 평가지;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Memo m1 = new Memo();
		Memo m2 = m1;
		m1=m2;
		
		// m1과 m2가 참조하는 객체가 
		// 같은 객체라면 true 
		// 그렇지 않으면 false가 출력
		System.out.println(m1 == m2);
	}

}
