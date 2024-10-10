package arrays;

import java.util.ArrayList;
import java.util.List;

/*Given an integer array nums of size n. Return all elements which appear more than n/3 times in the array. The output can be returned in any order.


Example 1
Input: nums = [1, 2, 1, 1, 3, 2]

Output: [1]

Explanation: Here, n / 3 = 6 / 3 = 2.

Therefore the elements appearing 3 or more times is : [1]*/
public class MajorityElementInAnArrayType2BruteForce {
    public static void main(String[] args) {
        int[] nums = {2, 2};
        List<Integer> list = majorityElementInAnArray(nums);
        System.out.println(list);
    }

    public static List<Integer> majorityElementInAnArray(int[] nums) {
        int freq = nums.length / 3;
        System.out.println(freq);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            if (list.contains(nums[i])) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }

            }
            if (count > freq) {
                list.add(nums[i]);
            }

        }
        return list;
    }
}
