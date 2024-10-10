package arrays;

public class MaximumProductSubArrayInAnArrayBruteForce {
    public static void main(String[] args) {
        int[] nums = {0, 2};
        int maxProduct = maxProduct(nums);
        System.out.println(maxProduct);
    }

    public static int maxProduct(int[] nums) {

        int maxProduct = Integer.MIN_VALUE;
        if (nums.length == 1) {
            return nums[0];
        } else {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i; j < nums.length; j++) {
                    int product = 1;
                    for (int k = i; k <= j; k++) {
                        product *= nums[k];
                    }
                    if (maxProduct < product) {
                        maxProduct = product;
                    }
                }


            }
            return maxProduct;
        }

    }
}
