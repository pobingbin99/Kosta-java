package ex0803.report;

/**
 * @author 이은진
 * @since 2026-08-03
 */
class Sort {
	/*
	 * 이미 정렬된 데이터들에 새로운 데이터를 삽입하는 알고리즘이다.
	 * 현재 index에 있는 데이터가 정렬된 범위에 삽입될 위치를 탐색한다.
	 * 삽입 위치부터 index-1 위치까지의 데이터들에 shift 연산을 수행한다.
	 * 삽입 위치에 해당 데이터를 저장하고, index 값을 1만큼 증가시킨다.
	 * index 값이 전체 데이터의 크기에 도달할 때까지 위의 과정을 반복한다.
	 */
	public static void insertSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
            int insert = i;
            int value = arr[i];

            for (int j = i-1; j >= 0; j--) {
                if (arr[j] < value) {
                    insert = j + 1;
                    break;
                }
                if (j == 0) {
                    insert = 0;
                }
            }
            for (int j = i; j > insert; j--) {
                arr[j] = arr[j-1];
            }
            arr[insert] = value;
        }
	}

	/*
	 * 인접한 두 데이터의 크기를 비교해 정렬하는 알고리즘이다.
	 * 현재 정렬되지 않은 범위에서 인접한 데이터끼리 비교한다.
	 * 앞의 데이터가 뒤의 데이터보다 크면 두 데이터의 위치를 교환(swap)한다.
	 * 한 번의 반복이 끝나면 가장 큰 데이터가 정렬 범위의 마지막 위치로 이동한다.
	 * 정렬이 완료된 영역을 제외하고 남은 데이터들에 대해 위의 과정을 반복한다.
	 * 비교 범위가 더 이상 남지 않을 때까지 반복하여 전체 데이터를 정렬한다.
	 */
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < (arr.length - 1); i++) {
            for (int j = 0; j < (arr.length - 1 - i); j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
	}
	
	/*
	 * 정렬되지 않은 범위에서 최솟값을 선택하여 정렬하는 알고리즘이다.
	 * 현재 index 위치부터 마지막 위치까지 탐색하며 최솟값 위치를 찾는다.
	 * 찾은 최솟값을 현재 index 위치의 데이터와 swap한다.
	 * index를 1씩 증가시키며 정렬되지 않은 범위를 점점 줄여간다.
	 * 모든 데이터가 정렬될 때까지 위의 과정을 반복한다.
	 */
	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            if (i != min) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
	}
	
	public static void printArray(int[] arr) {
		for (int n: arr) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
}
public class SortEx {
    public static void main(String[] args) {
        int[] arr1 = {5, 7, 1, 2, 4, 3, 8, 9, 6, 10};
        int[] arr2 = {4, 3, 1, 9, 5, 7, 8, 6, 10, 2};
        int[] arr3 = {1, 7, 4, 8, 5, 6, 9, 10, 2, 3};

        System.out.println("정렬 전");
        Sort.printArray(arr1);

        System.out.println("삽입 정렬 후");
        Sort.insertSort(arr1);
        Sort.printArray(arr1);
        System.out.println();
        
        System.out.println("정렬 전");
        Sort.printArray(arr2);

        System.out.println("버블 정렬 후");
        Sort.insertSort(arr2);
        Sort.printArray(arr2);
        System.out.println();
        
        System.out.println("정렬 전");
        Sort.printArray(arr3);

        System.out.println("선택 정렬 후");
        Sort.insertSort(arr3);
        Sort.printArray(arr3);
        System.out.println();
    }
}