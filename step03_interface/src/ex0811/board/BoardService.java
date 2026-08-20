package ex0811.board;

public interface BoardService {
	/**
	 * 글번호, 제목, 작성, 내용을 입력 받아 게시물 추가
	 * @Param: Board
	 * @Return: 1이면 등록 성공, 0이면 등록 실패
	 */
	int insert(Board board);
	
	/**
	 * 글번호에 해당하는 게시물의 제목과 내용 수정
	 * @Param: Board
	 * @Return: true이면 수정 성공, false는 수정 실패
	 */
	boolean update(Board board);
	
	/**
	 * 글번호에 해당하는 게시물 검색
	 * @Param: int
	 * @Return: Board 리턴, 실패시 null 리턴
	 */
	Board selectByNo(int no);
	
	/**
	 * 글번호에 해당하는 게시물 삭제(Qa, Free)
	 * @Param: int
	 * @Return: 1이면 삭제 성공, 0이면 삭제 실패
	 */
	default int delete(int no) {
		System.out.println("default delete()");
		return 1;
	}
	
	/**
	 * 전체 게시물 조회(출력)
	 * @Param: void
	 */
	static void selectAll() {
		System.out.println("static selectAll()");
		findByNo(1);
		findByNo(2);
		findByNo(3);
	}
	
	/**
	 * 게시물 정보 찾기 - 내부에서만 사용
	 * @Param: int
	 */
	private static void findByNo(int no) {
		System.out.println("private findByNo(" + no + ")");
	}
}