
package _08_Array2;

public class _Q9_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 값 입력부
		
		// 선언문
		int[][] a = {{1,2,3,4,5},
					 {6,7,8,9,10},
					 {11,12,13,14,15},
					 {16,17,18,19,20},
					 {21,22,23,24,25}};
		
		// 문제
		/*	{6, 1, 2, 3, 4},
		 *  {11, 12, 7, 8, 5},
		 *  {16, 17, 13, 9, 10},
		 *  {21, 18, 19, 14, 15},
		 *  {22, 23, 24, 25, 20}
		 */
	  			
		// 문제 풀이
		
		
		int maxRow=a.length;		// 행의 길이
		int maxCol=a[0].length;		// 열의 길이
		
		// 배열 값 출력부
		for(int i = 0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.println(a[i][j]+" ");
			}
			System.out.println();
		}

	}
}


