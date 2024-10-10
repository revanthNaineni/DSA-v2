package arrays.practice;

import java.util.Arrays;

public class SecondLargestElementBruteForce {
    public static void main(String[] args) {
        int[] nums = {6, 9, -1, 9, 7, 22, -99, 32, 32};
        System.out.println(secondLargestElement(nums));
    }

    static int secondLargestElement(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);

        for (int i = n-1; i >=0 ; i--) {
            if(nums[i]!=nums[i-1]){
                return nums[i-1];
            }
        }

        return -1;



    }
}
