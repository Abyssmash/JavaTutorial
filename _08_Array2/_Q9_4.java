package _08_Array2;

public class _Q9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= new int [4][5];
		int num=1;
		
		
		/* 문제
		 * {1, 2, 3, 4, 5},
		 * {10, 9, 8, 7, 6},
		 * {11, 12, 13, 14, 15},
		 * {20, 19, 18, 17, 16}
		 */

		// 0,0 0,1 0,2 0,3 0,4		// 행은 고정 열은 변화
		// 1,4 1,3 1,2 1,1 1,0		
		// 2,0 2,1 2,2 2,3 2,4		
		// 3,4 3,3 3,2 3,1 3,0
		
		// step 1
		// 행이 먼저 반복되고 다시 열이 반복된다.
		// 행은 아이로 결정
		
		// step 2
		// 열이 01234			이를 통해 짝수인 행에서는 증가
		// 열이 43210 반복				홀수인 행에서는 감소하는 것을 찾았다.
		
		// 2차원 배열의 값을 저장하는 코드
		for(int i=0; i<4; i++) {
			//System.out.println("현재 행 "+i);  디버깅용
			if(i%2==0) {
				for(int j=0; j<5; j++) {
					a[i][j]=num++;
					// 위 코드는 대입연산자가 일어난 후
					// 단일 연산자인 ++가 실행된다.
					// 만약 a[행][열]=++num;
					// 이것은 단일 연산자가 먼저 실행되고
					// 대입 연산자가 실행된다.
					// 첫번째 case를 후위 단일 연산자
					// 두번째 case를 전위 단일 연산자
					//System.out.println(i+"/"+j);
				}
			} else {
				for(int j=4; j>=0; j--) {
					a[i][j]=num++;
				}
			}
		}
		
		
		// 배열 값 출력부
		for(int i = 0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.println(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
