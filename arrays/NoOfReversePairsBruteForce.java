package arrays;

public class NoOfReversePairsBruteForce {
    public static void main(String[] args) {
        int[] nums = {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        long reversePairs = reversePairs(nums);
        System.out.println(reversePairs);
    }
    public static int reversePairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int temp1=nums[i];
                long temp2= 2L *nums[j];

                if (temp1 > temp2) {
                    count++;
                }

            }

        }
        return count;
    }
}
