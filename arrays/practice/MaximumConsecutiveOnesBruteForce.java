package arrays.practice;

public class MaximumConsecutiveOnesBruteForce {
    public static void main(String[] args) {
        int[] nums = {1, 1,1,1,1,1, 0, 1, 1, 1, 0, 1, 1};
        System.out.println(maxConsecutiveOnes(nums));
    }

    static int maxConsecutiveOnes(int[] nums) {

        int maxCount = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            int count = 1;
            if (nums[i] == 1) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                        if (maxCount < count) {
                            maxCount = count;
                        }
                    } else {
                        count = 0;
                        break;
                    }

                }
            }

        }
        return maxCount==Integer.MIN_VALUE?0:maxCount;
    }
}
