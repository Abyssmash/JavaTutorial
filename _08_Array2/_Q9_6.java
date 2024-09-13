package _08_Array2;

public class _Q9_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= new int[4][5];
		
		// 배열 값 입력부
		//int num=1;
		//for(int i=0; i < a.length; i++) {
		//	for(int j=0; j < a[0].length; j++) {
		//		a[i][j]=num;
		//		num++;
		//	}
		//}
		
		/* 문제
		 * {1, 2, 3, 4, 5},
		 * {14, 15, 16, 17, 6},
		 * {13, 20, 19, 18, 7},
		 * {12, 11, 10, 9, 8}
		 */
		
		// 문제 풀이
		
		// 배열 값 출력부
		// 배열 값 출력부
				for(int i = 0; i<a.length; i++) {
					for(int j=0; j<a[0].length; j++) {
						System.out.println(a[i][j]+"\t");
					}
					System.out.println();
				}
			}
		}
