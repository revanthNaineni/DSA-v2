package arrays.practice;

public class LargestElementInArrayOptimal {
    public static void main(String[] args) {
        int[] nums = {6,9,-1, 41,7,22,-99,32};
        System.out.println(findLargestElement(nums));
    }

    public static int findLargestElement(int[] nums){

        int max=nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(max<nums[i]){
                max=nums[i];
            }
        }
        return max;
    }
}
