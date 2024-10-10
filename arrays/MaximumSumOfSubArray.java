package arrays;

public class MaximumSumOfSubArray {

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, -2, 7, -4};
        int maxSum = generateSubArrays(nums);
        System.out.println(maxSum);
    }

    public static int generateSubArrays(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + nums[k];
                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                }
            }

        }
        return maxSum;
    }
}
