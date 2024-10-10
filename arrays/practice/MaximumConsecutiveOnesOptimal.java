package arrays.practice;

public class MaximumConsecutiveOnesOptimal {
    public static void main(String[] args) {
        int[] nums = {1, 1,1,1,1,1, 0, 1, 1, 1, 0, 1, 1};
        System.out.println(maxConsecutiveOnes(nums));
    }

    static int maxConsecutiveOnes(int[] nums) {

        int maxCount = Integer.MIN_VALUE;
        int count=0;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i]==1){
                count++;
                if(maxCount<count){
                    maxCount=count;
                }
            }else {
                count=0;
            }
        }

        return maxCount==Integer.MIN_VALUE?0:maxCount;
    }
}
