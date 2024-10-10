package arrays.practice;

public class MaximumSumOfSubArrayBruteForce {

    public static void main(String[] args) {
        int[] nums = {8};
        int maxSum = generateSubArrays(nums);
        System.out.println(maxSum);
    }

    public static int generateSubArrays(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum=0;
            for (int j = i; j < nums.length; j++) {
                sum+=nums[j];
                if(maxSum<sum){
                    maxSum=sum;
                }
            }

        }
        return maxSum;
    }

}
