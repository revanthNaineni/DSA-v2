package arrays.practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArrayOptimal {
    public static void main(String[] args) {
        int[] nums = {0, 0, 3, 3, 5, 6};
        int[] nums1 = removeDuplicates(nums);
        for (int i : nums1) {
            System.out.println(i);
        }
    }

    public static int[] removeDuplicates(int[] nums) {
        int temp = nums[0];
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != temp) {
                temp = nums[i];
                nums[++count] = temp;
            }
        }
        return nums;
    }
}

