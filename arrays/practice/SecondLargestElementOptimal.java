package arrays.practice;

public class SecondLargestElementOptimal {
    public static void main(String[] args) {
        int[] nums = {10, 10, 10, 10, 10};
        System.out.println(secondLargestElement(nums));
    }

    static int secondLargestElement(int[] nums) {
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
