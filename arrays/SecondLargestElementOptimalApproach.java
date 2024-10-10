package arrays;

public class SecondLargestElementOptimalApproach {

	public static void main(String[] args) {
		int[] nums = {99,34,6,9,-1,7,22,-99,32};
		System.out.println(secondLargestElement(nums, nums.length));

	}
	static int secondLargestElement(int[] nums, int n) {
        int max = nums[0];
        int secMax = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                secMax = max;
                max = nums[i];

            } else if (secMax < nums[i] && nums[i] < max) {
                secMax = nums[i];
            }
        }

        return secMax==Integer.MIN_VALUE?-1:secMax;

    }

}
