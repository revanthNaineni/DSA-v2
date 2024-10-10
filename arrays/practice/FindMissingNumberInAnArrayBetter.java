package arrays.practice;

public class FindMissingNumberInAnArrayBetter {
    public static void main(String[] args) {
        int[] nums={1, 3, 6, 4, 2, 5};
        System.out.println(findMissingNumber(nums));
    }

    public static int findMissingNumber(int[] nums){

        int sum=0;
        int n=nums.length;
        sum=(n*(n+1))/2;

        int arrSum=0;
        for (int i = 0; i <nums.length; i++) {
            arrSum+=nums[i];
        }

        return sum-arrSum;


    }
}
