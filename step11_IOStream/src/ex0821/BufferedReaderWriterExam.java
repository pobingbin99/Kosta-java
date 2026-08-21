package ex0821;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterExam {
	public BufferedReaderWriterExam( ) {
		// 문자 단위로 파일을 읽고/쓰기
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new FileReader("src/ex0821/input.txt"));
			bw = new BufferedWriter(new FileWriter("src/ex0821/output.txt"));
			
			// BufferedReader readLine() 한 줄 읽기 가능
			String str = null;
			while ((str = br.readLine()) != null) {
				// BufferedWriter newLine() 공백 추가 기능
				bw.write(str);
				bw.newLine();
			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) br.close();
				if (bw != null) bw.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new BufferedReaderWriterExam();
	}
}