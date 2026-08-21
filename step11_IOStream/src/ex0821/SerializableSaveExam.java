package ex0821;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializableSaveExam {
	public SerializableSaveExam() {
		// try-with-resources 적용
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/ex0821/save.txt"));){
			List<Member> list = new ArrayList<>();
			
			list.add(new Member("kim", 20, "서울"));
			list.add(new Member("lee", 30, "대전"));
			list.add(new Member("park", 40, "대구"));
			
			oos.writeObject(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("---- 직렬화 저장 완료 -----");
	}
	
	public static void main(String[] args) {
		new SerializableSaveExam();
	}
}
