package _08_Array2;

public class _Q9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a= new int[4][5];
		int num=1;
		// 배열 값 입력부
		for(int i=0; i < a.length; i++) {
			for(int j=0; j < a[0].length; j++) {
				a[i][j]=num;
				num++;
			}
		}
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
