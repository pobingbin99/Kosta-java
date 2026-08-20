package ex0811.board;

public class MainApp {
	Board board;
	BoardService boardService;
	
	public MainApp() {
		board = new FreeBoard(1, "제목1", "작성자1", "내용1");
		boardService = new FreeBoardServiceImpl();
		test(boardService, board);
		
		board = new QaBoard(1, "제목1", "작성자1", "내용1", false);
		boardService = new QaBoardServiceImpl();
		test(boardService, board);
		
		board = new UploadBoard(1, "제목1", "작성자1", "내용1", "파일1");
		boardService = new UploadBoardServiceImpl();
		test(boardService, board);
	}
	
	public void test(BoardService service, Board board) {
		service.insert(board);
		service.update(board);
		System.out.println(service.selectByNo(5));
		service.delete(5);
		BoardService.selectAll();
		System.out.println("------------------------------");
	}
	
	public static void main(String[] args) {
		new MainApp();
	}
}