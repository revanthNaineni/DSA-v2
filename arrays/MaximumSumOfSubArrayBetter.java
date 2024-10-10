package arrays;

public class MaximumSumOfSubArrayBetter {

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, -2, 7, -4,14};
        int maxSum = generateSubArrays(nums);
        System.out.println(maxSum);
    }

    public static int generateSubArrays(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                sum=sum+nums[j];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }

        }
        return maxSum;
    }
}
