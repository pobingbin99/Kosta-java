package ex0811.board;

public class FreeBoard extends Board {
	public FreeBoard() {
		
	}
	
	public FreeBoard(int no, String subject, String writer, String content) {
		super(no, subject, writer, content);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}