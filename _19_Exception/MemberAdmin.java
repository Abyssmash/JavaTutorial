package _19_Exception;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MemberAdmin {
	MemberOne [] m = new MemberOne[5];
	
	MemberAdmin(){ /*
		System.out.println(m[0]);
		System.out.println(m[1].getId());
		System.out.println(m[2]);
		System.out.println("close"); */
		test();
	}
	private void test() {
		File file = new File("Output.txt");
		FileWriter writer;
		try { // 직접 예외처리를 하는 구문
			writer = new FileWriter(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
	}
}
