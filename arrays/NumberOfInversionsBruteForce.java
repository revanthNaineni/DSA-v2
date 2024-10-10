package arrays;

public class NumberOfInversionsBruteForce {
    public static void main(String[] args) {
        int[] nums = {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        long numberOfInversions = numberOfInversions(nums);
        System.out.println(numberOfInversions);
    }

    public static long numberOfInversions(int[] nums) {
        long count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }

            }

        }
        return count;
    }
}
