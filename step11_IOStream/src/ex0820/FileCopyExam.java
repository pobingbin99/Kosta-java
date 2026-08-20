package ex0820;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileCopyExam {
	public FileCopyExam(String readFile, String writeFile) {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream(readFile));
			bos = new BufferedOutputStream(new FileOutputStream(writeFile));
			
			while(true) {
				int i = bis.read();
				if(i == -1) break;
				bos.write(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bis != null) bis.close();
				if (bos != null) bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		String readFile = JOptionPane.showInputDialog("카피할 파일명은?");
		String copyFile = JOptionPane.showInputDialog("저장할 파일명은?");
		
		new FileCopyExam(readFile, copyFile);
	}
}