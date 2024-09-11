package _08_Array2;

public class _Q8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = {{1,2,3,4,5},
				 {6,7,8,9,10},
				 {11,12,13,14,15},
				 {16,17,18,19,20},
				 {21,22,23,24,25}};
		
		// 4. 전체 배열의 값 중 짝수는 모두 몇 개인가?
		int row=a.length;
		int col=a[0].length;
		int cnt=0;
		for(int i=0; i < row; i++) {
			for(int j=0; j < col; j++) {
			if(a[i][j]%2==0) {
				cnt++;
			}
		}
		}
		System.out.println(cnt);
		
		// 로우와 행의 길이를 안다면 직접 세어서 넣어도 값은 똑같다.
		// 로우의 길이를 세어준다.
		// 컬럼의 길이를 세어준다.
		// 짝수를 세어서 넣어줄 공간을 만들어준다.
		// i는 행, j는 열을 의미한다.
	}

}
