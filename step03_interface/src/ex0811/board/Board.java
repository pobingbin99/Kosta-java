package ex0811.board;

/**
 * 모든 게시판이 공통으로 갖는 속성 관리 객체(DTO, VO)
 * 글번호(no), 제목(subject), 작성자(writer), 내용(content)
 */
public class Board {
	private int no;
	private String subject;
	private String writer;
	private String content;
	
	public Board( ) {
		
	}

	public Board(int no, String subject, String writer, String content) {
		this.no = no;
		this.subject = subject;
		this.writer = writer;
		this.content = content;
	}

	// Getter
	public int getNo() {
		return no;
	}

	public String getSubject() {
		return subject;
	}

	public String getWriter() {
		return writer;
	}

	public String getContent() {
		return content;
	}
	
	// Setter
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Board [no=");
		builder.append(no);
		builder.append(", subject=");
		builder.append(subject);
		builder.append(", writer=");
		builder.append(writer);
		builder.append(", content=");
		builder.append(content);
		return builder.toString();
	}
}