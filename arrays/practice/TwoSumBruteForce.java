package arrays.practice;

public class TwoSumBruteForce {

	public static void main(String[] args) {
		
		int[] nums = {1,9, 2, 10, 3,6};
		int target=7;

		int[] twoSum = twoSum(nums, target);

		for(int i:twoSum){
			System.out.println(i);
		}

	}

	private static int [] twoSum(int[] nums, int target) {

		int[] tempArr=new int[2];
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = 0; j < nums.length; j++) {
				if(nums[i]+nums[j]==target)
					tempArr[0]=i;
				tempArr[1]=j;
			}

		}
		return tempArr;
	}

}
