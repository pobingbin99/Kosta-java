package ex0803.report;

/**
 * @author 이은진
 * @since 2026-08-03
 */
class Lotto {
	private static final int LOTTO_SIZE = 6;
	private int[] lotto = new int[LOTTO_SIZE];

	/**
	 * 로또 번호의 중복 여부를 확인하는 메서드
	 * @param num 중복 확인할 로또 번호
	 * @return 중복이면 true, 중복이 아니면 false 반환
	 */
	public boolean checkDuplicate(int num) {
		for (int i = 0; i < LOTTO_SIZE; i++) {
			if (lotto[i] == num) {
				return true;
			}
		}
		return false;
	}


	/**
	 * 중복되지 않는 로또 번호를 생성해 배열에 저장하는 메서드
	 */
	public void createNumber() {
		int index = 0;

		while (index < LOTTO_SIZE) {
			int num = (int)(Math.random() * 45)+ 1;

			if (!checkDuplicate(num)) {
				lotto[index] = num;
				index++;
			}
		}
	}


	/**
	 * 버블 정렬을 이용해 로또 번호를 내림차순 정렬하는 메서드
	 */
	public void sortDescending() {
		for (int i = 0; i < (LOTTO_SIZE - 1); i++) {
            for (int j = 0; j < (LOTTO_SIZE - 1 - i); j++) {
                if (lotto[j] < lotto[j + 1]) {
                    int temp = lotto[j];
                    lotto[j] = lotto[j + 1];
                    lotto[j + 1] = temp;
                }
            }
        }
	}

	/**
	 * 로또 배열을 출력하는 메서드
	 */
	public void printNumber() {
		for (int i = 0; i < LOTTO_SIZE; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
	}
}

public class LottoEx {
	public static void main(String[] args) {
		// Lotto 클래스의 객체 생성
		Lotto lotto = new Lotto();

		// 번호 생성
		lotto.createNumber();

		// 내림차순 정렬
		lotto.sortDescending();

		// 출력
		lotto.printNumber();
	}
}