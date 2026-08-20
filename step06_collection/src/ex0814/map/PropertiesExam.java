package ex0814.map;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

public class PropertiesExam {
	Properties properties = new Properties();

	public PropertiesExam() {
		properties.setProperty("id", "lee");
		properties.setProperty("age", "20");
		properties.setProperty("name", "eunjin");

		for (String key : properties.stringPropertyNames()) {
			System.out.printf("%s ", key);
			System.out.printf("- %s\n", properties.get(key));
		}
	}

	/**
	 * 외부 .properties 파일을 로딩하는 방법 2가지 1) IO를 이용한 방법 2) ResourceBundle을 이용한 방법
	 *
	 * 1. this.getClass().getResourceAsStream("info.properties") 
	 * -> 현재 클래스가 있는 위에서부터 경로를 설정
	 * 
	 * 2. this.getClass().getClassLoader().getResourceAsStream("a.properties"); 
	 * -> this.getClass() 호출하면 classes폴더를 기준(bin)으로 경로를 잡는다.
	 * 
	 * 3. 프로젝트 내 resources폴더 존재 -> 정적문서(환경설정문서, schema, xml 문서)
	 * 
	 * 웹프로젝트 1) back - resources 2) front - resources/css, js, img
	 */

	// 1) IO를 이용한 방법
	public void test01() throws Exception {
		System.out.println("---------- test01() ----------");
		properties.clear();

		// 1. 절대경로를 이용해 파일 로딩
		properties.load(new FileInputStream("src/ex0814/map/test.properties"));
		
		// 모든 key-value 값 출력하기
		for (String key : properties.stringPropertyNames()) {
			System.out.println(key + " = " + properties.getProperty(key));
		} System.out.println();

		// 2. 상대경로를 이용해 파일 로딩
		InputStream inputStream = PropertiesExam.class.getResourceAsStream("/dbinfo.properties");
		properties.clear();
		properties.load(inputStream);
		
		// 모든 key-value 값 출력하기
		for (String key : properties.stringPropertyNames()) {
			System.out.println(key + " = " + properties.getProperty(key));
		} System.out.println();
		 
		// 3.상대경로를 이용해 파일 로딩
		InputStream inputStream2 = this.getClass().getResourceAsStream("/dbinfo.properties");
		properties.clear();
		properties.load(inputStream2);
		
		// 모든 key-value 값 출력하기
		for (String key : properties.stringPropertyNames()) {
			System.out.println(key + " = " + properties.getProperty(key));
		} System.out.println();

		// 4.ClassLoader의 모든 경로에서 파일 읽음 (보통 resources 폴더의 파일 읽을때)
		InputStream inputStream3 = this.getClass().getClassLoader().getResourceAsStream("dbinfo.properties");
		properties.clear();
		properties.load(inputStream3);

		// 모든 key-value 값 출력하기
		for (String key : properties.stringPropertyNames()) {
			System.out.println(key + " = " + properties.getProperty(key));
		}
	}

	// 2) ResourceBundle을 이용한 방법
	public void test02() {
		System.out.println("---------- test02() ----------");

		// ResourceBundle는 .properties 파일을 로딩하는 전용 클래스
		ResourceBundle rb = ResourceBundle.getBundle("dbinfo");
		
		// 모든 key-value 값 출력하기
		for (String key : rb.keySet()) {
			System.out.println(key + " = " + rb.getString(key));
		}
	}

	public static void main(String[] args) throws Exception {
		PropertiesExam pe = new PropertiesExam();
		
		pe.test01();
		pe.test02();
	}
}