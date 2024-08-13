package _01Array;

public class Q2 {

	public static void main(String[] args) {
		
		// 문제 1
		int[] number = {30, 40, 50, 60, 55};
		System.out.println(number[0]+"/"+number[1]+"/"+number[2]+"/"
				+number[3]+"/"+number[4]);
		System.out.println("----------------------");
		
		// 문제 2
		String[] firstName = new String[3];
		firstName[0]="kim";
		firstName[1]="lee";
		firstName[2]="park";
		System.out.println(firstName[0]+"/"+firstName[1]+"/"+firstName[2]);
		System.out.println("----------------------");
		
		// 문제 3
		int[] lotto ={6, 12, 33, 4, 5, 26};
		System.out.println(lotto[2]+2);
		System.out.println("----------------------");
		
		// 문제 4
		System.out.println(lotto[0]+lotto[2]+lotto[4]);
		System.out.println("----------------------");
		
		// 문제 5
		lotto[0]=6;
		lotto[1]=12+lotto[0];
		lotto[2]=33+lotto[0]+lotto[1];
		lotto[3]=4+lotto[0]+lotto[1]+lotto[2];
		lotto[4]=5+lotto[0]+lotto[1]+lotto[2]+lotto[3];
		lotto[5]=26+lotto[0]+lotto[1]+lotto[2]+lotto[3]+lotto[4];
		System.out.println(lotto[0]+"/"+lotto[1]+"/"+lotto[2]+"/"
				+lotto[3]+"/"+lotto[4]+"/"+lotto[5]);
		System.out.println("----------------------");
		
		// 문제 6
		lotto[0]=6;
		lotto[1]=12;
		lotto[2]=33;
		lotto[3]=4;
		lotto[4]=5;
		lotto[5]=26;
		System.out.println((lotto[3]%2)!=0);
		System.out.println("----------------------");
		
		// 문제 7
		int money=2750;
		int pay=10000;
		int payback=pay-money;
		int [] payback2= {payback/1000,(payback%1000)/100, (payback%100)/10};
		System.out.println("천원"+payback2[0]+"개,백원"+payback2[1]+"개,십원"+payback2[2]+"개");
		System.out.println("----------------------");
		
		// 문제 8
		int []A= {700, 500};
		int []B= {900, 300};
		int []C= {650, 150};
		System.out.println(((C[0]>=A[0])&&((C[1]-3)>=B[1]))&&(((C[0]+3)<=B[0])&&C[1]<=A[1]));
	}

}

