package _08_Array2;

public class _Q9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= new int[4][5];
		
		// 기본값
		//int num=1;
		//for(int i=0; i < a.length; i++) {
		//	for(int j=0; j < a[0].length; j++) {
		//		a[i][j]=num;
		//		num++;
		//	}
		//}
		
		/* 문제
		 * {1, 2, 4, 7, 11},
		 * {3, 5, 8, 12, 15},
		 * {6, 9, 13, 16, 18},
		 * {10, 14, 17, 19, 20}
		 */
		
		// 문제 풀이
		
		// 배열 값 출력부
		for(int i = 0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.println(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
