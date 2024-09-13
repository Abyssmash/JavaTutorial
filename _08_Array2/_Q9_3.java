package _08_Array2;

public class _Q9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a= new int[4][5];
		int num=1;
		/* 문제
		 * {20, 19, 18, 17, 16},
		 * {15, 14, 13, 12, 11},
		 * {10, 9, 8, 7, 6},
		 * {5, 4, 3, 2, 1}
		 */
		
		// 문제 풀이
		// [3][4] [3][3] [3][2] [3][1] [3][0]  행은 고정 3  열 4 3 2 1 0
		// [2][4] [2][3] [2][2] [2][1] [2][0]  행은 고정 2  열 4 3 2 1 0
		
		
		// 해설 코드
		for(int i=3; i>=0; i--) {
			for(int j=4; j>=0; j--) {
				a[i][j]=num;
				num++;
			}
		}
		
		// 배열 값 출력부
		for(int i = 0; i<4; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
