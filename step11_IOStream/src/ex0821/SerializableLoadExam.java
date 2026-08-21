package ex0821;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class SerializableLoadExam {
	public SerializableLoadExam() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/ex0821/save.txt"));) {
			@SuppressWarnings("unchecked")
			List<Member> list = (List<Member>)ois.readObject();
			
			System.out.println("리스트 사이즈: " + list.size());
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("---- 역직렬화 출력 완료 -----");
	}
	
	public static void main(String[] args) {
		new SerializableLoadExam();
	}
}
