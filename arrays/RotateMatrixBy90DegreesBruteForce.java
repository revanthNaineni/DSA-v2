package arrays;

public class RotateMatrixBy90DegreesBruteForce {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3,-1 }, { 4, 5, 6,-1 }, { 7, 8, 9,-1 }, {10,11,12,-1} };
		int left = 0;
		int top = 0;
		int bottom = matrix.length - 1;
		int right = matrix[0].length-1;

		int[][] matrix90 = new int[matrix.length][matrix[0].length];

		for (int k = 0; k < matrix.length; k++) {

			for (int i = 0; i < matrix[0].length; i++) {

				matrix90[i][bottom] = matrix[top][i];
				

			}
			top++;
			bottom--;
		}
		
		//printing array
		for (int i = 0; i < matrix90.length; i++) {
			for (int j = 0; j < matrix90.length; j++) {
				System.out.println(matrix90[i][j]);
			}
		}
		

	}

}
