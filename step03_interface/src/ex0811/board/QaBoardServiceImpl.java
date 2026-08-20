package ex0811.board;

public class QaBoardServiceImpl implements BoardService {
	@Override
	public int insert(Board board) {
		System.out.println("QaBoard: " + board);
		return 1;
	}

	@Override
	public boolean update(Board board) {
		System.out.println("QaBoard: " + board);
		return true;
	}

	@Override
	public Board selectByNo(int no) {
		return new QaBoard(no, "게시물 조회", "eunjin", "FreeBoard 게시물 조회", false);
	}
	
	
	@Override
	public int delete(int no) {
		System.out.println("QaBoard delete()");
		return 1;
	}
}