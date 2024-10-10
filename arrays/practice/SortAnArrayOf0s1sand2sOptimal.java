package arrays.practice;

public class SortAnArrayOf0s1sand2sOptimal {
    public static void main(String[] args) {
        int[] nums = {0, 2, 0, 2, 1, 1, 0};
        int[] sortedArray = sortArray(nums);
        for (int i : sortedArray) {
            System.out.println(i);
        }
    }

    public static int[] sortArray(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                mid++;
                low++;
            } else if (nums[mid] == 1) {
                mid++;

            } else if (nums[mid] == 2) {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;

            }
        }
        return nums;
    }

}
