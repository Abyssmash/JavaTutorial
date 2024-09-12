package _08_Array2;

public class _Q9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a= new int[4][5];
		//int num=1;

		// 기본값
		//for(int i=0; i < a.length; i++) {
		//	for(int j=0; j < a[0].length; j++) {
		//		a[i][j]=num;
		//		num++;
		//	}
		//}
		
		/* 문제
		 * {20, 19, 18, 17, 16},
		 * {15, 14, 13, 12, 11},
		 * {10, 9, 8, 7, 6},
		 * {5, 4, 3, 2, 1}
		 */
		
		// 문제 풀이
		// 필요한 변수 목록
		// 행의 길이, 열의 길이
		
	
		
		int row=a.length-1;
		int col=a[0].length-1;
		int num=20;
		for(int i=row; i >=0; i-- ) {
			for(int j=col; j >=0; j--) {
				a[i][j]=num;
				num--;
				System.out.println(a[i][j]);
			}
			System.out.println();
		}
		
		// 배열 값 출력부
		for(int i = 0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.println(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
