package ex0811.board;

public class UploadBoardServiceImpl implements BoardService {
	@Override
	public int insert(Board board) {
		System.out.println("UploadBoard: " + board);
		return 1;
	}

	@Override
	public boolean update(Board board) {
		System.out.println("UploadBoard: " + board);
		return true;
	}

	@Override
	public Board selectByNo(int no) {
		return new UploadBoard(no, "게시물 조회", "eunjin", "FreeBoard 게시물 조회", "파일");
	}
}