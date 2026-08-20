package ex0812.exam01;

public class MainApp {
	public static void main(String[] args) {
		/*Box box = new Box();
		
		box.setContent("상품");
		if (box.getContent() instanceof String) {
			String content = (String)box.getContent();
			System.out.println(content);
		}
		
		box.setContent(new Board());
		if (box.getContent() instanceof Board) {
			Board board = (Board)box.getContent();
			System.out.println(board.getBno());
		}*/
		
		Box<String> box = new Box<>("제너릭 String");
		System.out.println(box.getContent());
		
		Box<Board> boardBox = new Box<>(new Board());
		System.out.println(boardBox.getContent().getBno());
	}
}