package _08_Array2;

import java.util.Arrays;

public class _Q8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2차원 배열 자료형을 저장할 변수 a를 선언
		// 2차원 배열은 행이 5. 즉 0번부터 4번
		// 각 행은 열이 4, 즉 0번부터 3번
		
		int [][] a = {{1,2,3,4,5},
					 {6,7,8,9,10},
					 {11,12,13,14,15},
					 {16,17,18,19,20},
					 {21,22,23,24,25}};
		
		// 1. 2차원 배열 a의 2번째 행의 모든 값을 출력하시오.
		for(int i=0; i < 5 ; i++) {		// i 5행
					System.out.println(a[1][i]+"");
				}
			}
}
		
		
		//+ 모든 행의 값 출력하기
		//System.out.println(Arrays.deepToString(a));	
