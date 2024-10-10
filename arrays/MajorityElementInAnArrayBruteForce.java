package arrays;

/*Given an integer array nums of size n, return the majority element of the array.



The majority element of an array is an element that appears more than n/2 times in the array. The array is guaranteed to have a majority element.


        Example 1
Input: nums = [7, 0, 0, 1, 7, 7, 2, 7, 7]

Output: 7

Explanation: The number 7 appears 5 times in the 9 sized array*/
public class MajorityElementInAnArrayBruteForce {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int majorityElementInAnArray = majorityElementInAnArray(nums);
        System.out.println(majorityElementInAnArray);
    }

    public static int majorityElementInAnArray(int[] nums) {
        int majorityNo = nums[0];
        int maxCount = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
                if (maxCount < count) {
                    maxCount = count;
                    majorityNo = nums[i];
                }
            }
        }
        return majorityNo;
    }
}
