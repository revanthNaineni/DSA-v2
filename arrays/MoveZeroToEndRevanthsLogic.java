package arrays;

public class MoveZeroToEndRevanthsLogic {

	public static void main(String[] args) {
		int arr[] = { 0, 0, 0, 1, 3, -2, 0, 8, 9, 0 };
		int newArr[] = new int[arr.length];

		int start = 0;
		int end = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				newArr[(arr.length - 1) - end] = 0;
				end++;
			} else {
				newArr[start] = arr[i];
				start++;
			}
		}

		for (int i : newArr) {
			System.out.println(i);
		}

	}

}
