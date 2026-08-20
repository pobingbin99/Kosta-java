package ex0812.exam01;

//public class Box {
//	private Object content;
//	
//	public void setContent(Object obj) {
//		this.content = obj;
//	}
//	
//	public Object getContent() {
//		return this.content;
//	}
//}

public class Box<T> {
	private T content;
	
	public Box(T content) {
		this.content = content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
	public T getContent() {
		return this.content;
	}
}