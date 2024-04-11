package chapter16.stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

// 바이트 단위로 작업하는 출력스트림 예제.
public class FileOutputStreamTest1 {

	public static void main(String[] args) {
        // true : output.txt 파일명이 존재하면, 파일에 기존내용에 추가된다.
		// 파일이 존재 안하면, 새로 생성한다.
		try(FileOutputStream fos = new FileOutputStream("output.txt", true)) {
			
			fos.write(97); // a
			fos.write(98); // b
			fos.write(99); // c
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("출력완료");

	}

}
