package chapter16.stream.other;

import java.io.File;
import java.io.IOException;

// File클래스 사용
public class FileTest {

	public static void main(String[] args) {
		
		File file = new File("C:\\Deb\\JAVALEC\\javaWorkspace\\study\\newFile.txt");
		
		try {
			file.createNewFile(); // 경로에 newFile.txt생성
			
			// newFile.txt 파일정보
			System.out.println(file.isFile()); //파일인지 확인
			System.out.println(file.isDirectory()); // 폴더인지 확인
			System.out.println(file.getName()); // 파일명 확인
			System.out.println(file.getAbsolutePath());//파일의 절대경로
			System.out.println(file.getPath());//파일경로
			System.out.println(file.canRead());//파일읽기상태
			System.out.println(file.canWrite());// 파일쓰기상태
			
			file.delete();// 파일삭제.
			
			File dir = new File("C:\\Deb\\JAVALEC\\javaWorkspace\\study\\newFoloder");
		
			dir.mkdirs(); // 폴더생성
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
