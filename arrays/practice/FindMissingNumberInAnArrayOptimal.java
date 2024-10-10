package arrays.practice;

public class FindMissingNumberInAnArrayOptimal {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 5, 6};
        System.out.println(findMissingNumber(nums));
    }

    public static int findMissingNumber(int[] nums) {
        int xor1 = 0;
        int xor2 = 0;
        for (int i = 0; i < nums.length; i++) {
            xor1 = xor1 ^ nums[i];
            xor2 = xor2 ^ i;
        }
        xor2 = xor2 ^ nums.length;
        return xor1 ^ xor2;
    }

}
