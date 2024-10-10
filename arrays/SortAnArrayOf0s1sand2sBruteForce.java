package arrays;

public class SortAnArrayOf0s1sand2sBruteForce {

    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};

        int[] arr1 = sortArray(arr);
        for (int i : arr1) {
            System.out.println(i);
        }
    }

    public static int[] sortArray(int[] nums) {

        int zeroes = 0;
        int ones = 0;
        int twos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroes++;
            } else if (nums[i] == 1) {
                ones++;

            } else if (nums[i] == 2) {
                twos++;
            }

        }

        for (int i = 0; i < zeroes; i++) {
            nums[i] = 0;
        }

        for (int i = zeroes; i < zeroes + ones; i++) {
            nums[i] = 1;
        }
        for (int i = zeroes + ones; i < zeroes + ones + twos; i++) {
            nums[i] = 2;
        }

        return nums;

    }

}
