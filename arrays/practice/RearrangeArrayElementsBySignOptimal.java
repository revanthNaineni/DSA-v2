package arrays.practice;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArrayElementsBySignOptimal {

    public static void main(String[] args) {

        int[] nums = {-8, 2, 4, 5, -1, -3, -4, 48};
        int[] ints = rearrangeElements(nums);

        for (int i : ints) {
            System.out.println(i);
        }

    }

    public static int[] rearrangeElements(int[] nums) {
        int[] tempArr = new int[nums.length];

        int positiveCount = 0;
        int negativeCount = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                tempArr[positiveCount] = nums[i];
                positiveCount = positiveCount + 2;
            } else if (nums[i] < 0) {
                tempArr[negativeCount] = nums[i];
                negativeCount = negativeCount + 2;

            }

        }

        return tempArr;

    }

}
