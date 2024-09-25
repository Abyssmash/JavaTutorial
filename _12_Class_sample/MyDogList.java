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
		dogList[1].name="abc";
		System.out.println(dogList[1].name);
		System.out.println(dogList[2].name);
		System.out.println(dogList[3].name);
		
		for(int i=0; i < 5; i++) {
			if(dogList[i]!=null) {
			System.out.println(dogList[i].name);
			}
		}
		// 강아지 검색
		String s="땡칠이";
		for(int i = 0; i < 5; i++) {
			if(dogList[i]!=null) {
				if(dogList[i].name.equals(s)) {
					System.out.println("찾음");
					break;
				}
			}// 만약 땡칠이가 어디에 있는지 알아내려면? i를 찾아냄
		}
	}
}
