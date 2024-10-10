package arrays.practice;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 3};
        int target = 3;
        int i = linearSearch(nums, target);
        System.out.println(i);

    }

    public static int linearSearch(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }

        }
        return -1;
    }
}
