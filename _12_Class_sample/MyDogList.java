package _12_Class_sample;

public class MyDogList {
	
	Dog[] dogList = new Dog[5];

	MyDogList(){
		System.out.println("-- 도그 관리 --");
		System.out.println(dogList[0]);
		if(dogList[0]!=null) {	// 만약 값이 없으면 주소가 없어서 예외라고 나오기 때문에 if문 작성
			System.out.println(dogList[0].name);	
		}
		dogList[1]=new Dog();
		System.out.println(dogList[1]);
		dogList[2]=dogList[1];
		System.out.println(dogList[2]);
		dogList[3]=new Dog();
		System.out.println(dogList[3]);
		Dog dd = new Dog();
		dogList[4]=dd;
		System.out.println(dd);
		System.out.println(dogList[4]);
		
	}
}
