package ex0820;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputExam {
	public FileInputOutputExam() {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("src/ex0820/test.txt");
			fos = new FileOutputStream("src/ex0820/outputTest.txt");
			
			// 읽을 수 있는 바이트 수
			int len = fis.available();
			
			// 바이트 배열 생성
			byte[] byteArr = new byte[len];
			
			// read(byte[] b) 메서드 사용
			fis.read(byteArr);
			System.out.println(new String(byteArr));
			
			// write(byte[] b) 메서드 사용
			fos.write(byteArr);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) fis.close();
				if (fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new FileInputOutputExam();
	}
}
