package arrays;

public class CheckifArrayIsSortedAndRotated {

	public static void main(String[] args) {
		int nums[]= {2,1,3,4};
		
		IsArraySortedandRotated(nums);
	}

	private static boolean IsArraySortedandRotated(int[] nums) {
		int count=0;
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>nums[i+1]) {
				count++;
			}
		}
		
		if(nums[0]<nums[nums.length-1]) {
			count++;
		}
		
		return count<=1;
	}

}
