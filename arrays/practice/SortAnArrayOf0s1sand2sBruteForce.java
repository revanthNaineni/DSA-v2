package arrays.practice;

public class SortAnArrayOf0s1sand2sBruteForce {

    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};

        int[] arr1 = sortArray(arr);
        for (int i : arr1) {
            System.out.println(i);
        }
    }

    public static int[] sortArray(int[] nums) {

        for (int i = 0; i < nums.length-1; i++) {
            boolean isSorted=false;
            for (int j = 0; j < nums.length-i-1; j++) {
                if(nums[j]>nums[j+1]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                    isSorted=true;
                }
            }
            if(!isSorted){
                break;
            }

        }
        return nums;
    }

}
