package _02if;

public class _00_Before {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**Q2
		 * 수강관리 프로젝트를 진행한다.
		 * 학생의 정보는 이름 학번 나이 성적이다. (정보)
		 * 나이가 18세 미만은 수강신청을 할 수 없다. (조건 1)
		 * 성적이 60점 이상이면서 70점 미만인 학생은 수강신청 할 수 있지만 이름뒤에 별표를 추가한다.(조건 2)
		 * 성적을 기준으로
		 * 90점 이상은 A
		 * 80점 이상은 B
		 * 70점 이상은 C
		 * 60점 이상은 D
		 * 60점 미만은 F라고 출력한다. (조건 3)
		 */
		int age = 18;
		if (age < 18) {
			System.out.println("수강신청 불가");
		}else if (age >= 18){
			System.out.println("수강신청 가능");
		}
		
		int result = 65;
		System.out.println(result>=90);
		System.out.println(result>=80);
		System.out.println(result>=70);
		System.out.println(result>=60);
		System.out.println(result<60);
		
		if (result>=60) {
			System.out.println("*");
		}
		
		if (result>=90) {
			System.out.println("A");
		}else if(result>=80) {
			System.out.println("B");
		}else if(result>=70) {
			System.out.println("C");
		}else if(result>=60) {
			System.out.println("D");
		}else if(result<60) {
			System.out.println("F");
		}	
	}									
}


