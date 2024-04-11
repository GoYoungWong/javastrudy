package chapter16.stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

// 바이트단위로 작업
// 파일의 내용을 배열을 사용하여 , 10바이트씩 읽어오기.

// 보통은 텍스트 파일은 바이트단위로 작업보다는 문자단위로 작업을 한다.  
public class FileInputStreamTest3 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input.txt")) {
			
			// 10바이트씩 읽어오는 정보를 저장하는 임시기억장소
			byte[] bs = new byte[10];
			
			int i;
			
			// fis.read(bs) : 10바이트씩 읽어와서 bs에 저장.
			while((i=fis.read(bs)) != -1) {
				for(int k=0; k<i; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println(": " + i + "바이트 읽음");
			}
				
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
