package arrays.practice;

public class LargestElementinArrayBruteForce {
    public static void main(String[] args) {
        int[] nums = {6,9,-1, 41,7,22,-99,32};
        System.out.println(findLargestElement(nums));
    }

    public static int findLargestElement(int[] nums){

        for (int i = 0; i < nums.length-1; i++) {
            //boolean isSorted=false;
            for (int j = 0; j < nums.length-i-1; j++) {
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }

            }
        }
        return nums[nums.length-1];
    }
}
