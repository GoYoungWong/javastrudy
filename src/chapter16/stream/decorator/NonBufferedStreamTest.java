package chapter16.stream.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;

// 버퍼기능을 제공하는 보조스트림을 사용하지 않을 경우 속도체크
// "a.zip"파일을 읽어서 "copy.zip" 파일을 생성하여 쓰는 작업(파일복사)
public class NonBufferedStreamTest {

	public static void main(String[] args) {
		
		long millsecond = 0; // 시간체크용 변수.
		
		try(
				FileInputStream fis = new FileInputStream("a.zip");  // "a.zip" 파일이 준비.
				FileOutputStream fos = new FileOutputStream("copy.zip"); // 객체생성이 되면, 자동으로 "copy.zip" 파일이 생성. 
			) 
		{
			// 파일복사 작업이 시작하기 전 1970년1월1일 00시00분00초에서 현재날짜와시간까지 흐른 누적된시간을 밀리세컨드로 반환.
			millsecond = System.currentTimeMillis();
			
			// 파일복사. 입력스트림(fis)으로 a.zip파일의 내용을 읽어와서, 출력스트림(fos)으로 copy.zip파일에 내용을 쓰는 작업
			int i;
			while((i = fis.read()) != -1) {
				fos.write(i);
			}
			
			// 파일복사 작업이 종료된 시간
			millsecond = System.currentTimeMillis() - millsecond;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("파일 복사시간: " + millsecond + " ms 소요됨");
	}

}
