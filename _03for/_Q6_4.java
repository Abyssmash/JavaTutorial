package _03for;

public class _Q6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4 난건물주
		// int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1}
		// int size=2;
		// arr 배열에서 0이 의미하는 것은 공터이다. 
		// size는 건물의 크기 이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다. 
		// size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
		// size가 2일경우에 7개이다. 
		
		// (1) 0이 연속적으로 2개 나와야함. 그러면 총 7개
		// (2) 0이 연속적으로 2개 나오지 않으면 순회
		int bt=0;
		int size=2; 
		int cnt=0;
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		for (int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				cnt++;
			}else {
				cnt=1;
			}
			if(cnt!=0) {
				cnt++;
				cnt+=bt;
			}
		}
		System.out.println(bt);
	}
}
