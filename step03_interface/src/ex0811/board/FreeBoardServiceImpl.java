package ex0811.board;

public class FreeBoardServiceImpl implements BoardService {
	@Override
	public int insert(Board board) {	
		System.out.println("FreeBoard: " + board);
		return 1;
	}

	@Override
	public boolean update(Board board) {
		System.out.println("FreeBoard: " + board);
		return true;
	}

	@Override
	public Board selectByNo(int no) {
		return new FreeBoard(no, "게시물 조회", "eunjin", "FreeBoard 게시물 조회");
	}
	
	@Override
	public int delete(int no) {
		System.out.println("FreeBoard delete()");
		return 1;
	}
}