package _08_Array2;

public class _Q9_0_문제분석 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 해석
				//선언문(변수와 자료형) 변수명: a, 자료형: 2차원 배열
				//변수: 값을 저장하는 기억 공간
				//2차원 배열: 행과 열로 이루어진 기억 공간
				//int[4][5]=행이 4개 열이 5개
				//행의 인덱스 번호는 0-3, 열의 인덱스 번호는 0-4
				
				//즉 : 행이 4개 열이 5개로 이루어진 2차원배열 a를 선언 (배열만 선언, 인덱스값은 0)
				int[][] a= new int[4][5];
				int num=1;
				
				// 2차원 배열 a의 값을  0번행부터 모두 출력하는 코드
				for(int 행=0; 행 < 4; 행++) {
					// System.out.println(">행"+행);
					for(int 열=0; 열 < 5; 열++) {
						System.out.print(a[행][열]+"\t");
					}
					System.out.println();
					System.out.println();
				}
				
				// if, for 등 한가지 기능만 정의하고 작성한다.
				// 한 가지 기능만 정의하고 작성하는 개발자의 센스다. 
				// 따로 작성하면 재사용성이 증가하기 때문이다.
				
				// 2차원 배열의 값을 저장하는 코드
				for(int i=0; i < 4; i++) {
					for(int j=0; j < 5; j++) {
						// i와 j값으로 배열을 순회하는 순서를 결정
						// 순회하면서 num의 값을 저장한 것
						a[i][j]=num;
						// 저장했으니 num의 값을 증가시킨 것 
						num++;
					}
				}
	}

}
