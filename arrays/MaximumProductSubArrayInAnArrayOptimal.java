package arrays;

public class MaximumProductSubArrayInAnArrayOptimal {
    public static void main(String[] args) {
        int[] nums = {0, 2,0};
        int maxProduct = maxProduct(nums);
        System.out.println(maxProduct);
    }

    public static int maxProduct(int[] nums) {
        int prefix=1,suffix=1;

        int maxProduct=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(prefix==0)
                prefix=1;
            if (suffix==0)
                suffix=1;

            prefix*=nums[i];
            suffix*=nums[nums.length-i-1];
            maxProduct=Math.max(maxProduct,Math.max(prefix,suffix));
        }
        return maxProduct;

    }
}
