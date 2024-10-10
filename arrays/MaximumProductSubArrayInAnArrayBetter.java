package arrays;

public class MaximumProductSubArrayInAnArrayBetter {
    public static void main(String[] args) {
        int[] nums = {0, 2,0};
        int maxProduct = maxProduct(nums);
        System.out.println(maxProduct);
    }

    public static int maxProduct(int[] nums) {

        int maxProduct = Integer.MIN_VALUE;
        if (nums.length == 1) {
            return nums[0];
        } else {
            for (int i = 0; i < nums.length; i++) {
                int product = 1;
                for (int j = i; j < nums.length; j++) {
                    product *= nums[j];
                    if (maxProduct < product) {
                        maxProduct = product;
                    }
                }


            }
            return maxProduct;
        }

    }
}
