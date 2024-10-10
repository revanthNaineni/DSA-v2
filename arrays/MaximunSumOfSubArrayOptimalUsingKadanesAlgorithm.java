package arrays;

public class MaximunSumOfSubArrayOptimalUsingKadanesAlgorithm {
    public static void main(String[] args) {
        int[] nums = {-4, -3, -2, -1};
        int maxSumOfSubArray = maxSumOfSubArray(nums);
        System.out.println(maxSumOfSubArray);
    }

    public static int maxSumOfSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;

            }

        }
        return maxSum;
    }
}
