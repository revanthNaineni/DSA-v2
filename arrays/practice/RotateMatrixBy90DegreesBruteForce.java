package arrays.practice;

public class RotateMatrixBy90DegreesBruteForce {

	public static void main(String[] args) {
		int[][] nums = { { 1, 2, 3 }, { 4, 5, 6}, { 7, 8, 9 } };
		int[][] rotatedMatrixBy90Degree = rotateMatrixBy90Degree(nums);
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				System.out.println(rotatedMatrixBy90Degree[i][j]);
			}
		}


	}

	public static int[][] rotateMatrixBy90Degree(int[][] nums){
		int top=0;
		int bottom=nums.length-1;
		int left=0;
		int right=nums[0].length-1;
		int[][] temp=new int[nums.length][nums.length];

		for (int i = 0; i < nums.length; i++) {

			for (int j = 0; j < nums.length; j++) {
				temp[j][bottom] = nums[top][j];
			}

			top++;
			bottom--;
		}

		return temp;
		}

}
