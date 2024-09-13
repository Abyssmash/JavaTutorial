package _08_Array2;

public class _Q9_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= new int[4][5];
		int num=1;
		
		/* 문제
		 * {1, 2, 3, 4, 5},
		 * {14, 15, 16, 17, 6},
		 * {13, 20, 19, 18, 7},
		 * {12, 11, 10, 9, 8}
		 */
		
		// 문제 풀이
		
		// 변수 4개 만들기
		int minR=0;			// 행의 최솟값
		int maxR=3;			// 행의 최댓값
		int minC=0;			// 열의 최솟값
		int maxC=4;			// 열의 최댓값
		
		// 맨 위에 부분 숫자 채우기
		// 맨 위는 행 최솟값 0 열 최솟값 0 열 최댓값 4
		// 맨 위에서 두번째는 행 최솟값 1 열 최솟값 1 열 최댓값 3
		
		for(int j=0; j<2; j++) {			// 두번 
			
			for(int i=minC; i <= maxC; i++) {
				a[minR][i]=num++;
			}
			// 위 반복문이 완료되었다면 0번행은 채울 필요없다.
			// 행의 최소값을 증가시켜 버린다.
			minR++;
			for(int i=minR; i <= maxR; i++) {
				a[i][maxC]=num++;
			}
			maxC++;
			for(int i=maxC; i >= minC; i--) {
				a[maxR][i]=num++;
			}
			maxR--;		// 행 1 2 	열은 0 3
			for(int i=maxR; i >= minR; i--) {
				a[i][minC]=num++;
			}
			minC++;		// 행 1 2	열은 1 3
		}
		
		// 2차원 배열 a의 값을 0번 행부터 모두 출력
		for(int i = 0; i<4; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(a[i][j]+"\t");		// ln 삭제하면 출력이 가로로 정렬됨 +
			}
			System.out.println();		// 줄 바꿈
		}
	}

}
