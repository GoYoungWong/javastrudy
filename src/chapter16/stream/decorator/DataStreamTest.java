package chapter16.stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// 보조스트림
// DataInputStream, DataOutputStream
// 데이터타입 크기를 사용하여 읽고, 쓰는 작업을 할 때 사용.
public class DataStreamTest {

	public static void main(String[] args) {
		
		// 출력스트림 작업
		try(
			// 메인스트림
			FileOutputStream fos = new FileOutputStream("data.txt");   // 0바이트 파일생성
			// 보조스트림
			DataOutputStream dos = new DataOutputStream(fos);
		   ) {
		   
			// 읽어오는 것을 생각해서 저장순서가 중요하다.
		   dos.writeByte(100);
		   dos.writeChar('A');
		   dos.writeInt(10);
		   dos.writeFloat(3.14f);
		   dos.writeUTF("Test");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// 입력스트림 작업
		try(	
				FileInputStream fis = new FileInputStream("data.txt");  // 메인스트림
				DataInputStream dos = new DataInputStream(fis);  // 보조스트림
			   ) {
			   // 저장된 순서대로 읽기작업
			
				System.out.println(dos.readByte());
				System.out.println(dos.readChar());
				System.out.println(dos.readInt());
				System.out.println(dos.readFloat());
				System.out.println(dos.readUTF());
				
			}catch(Exception e) {
				e.printStackTrace();
			}

	}

}
