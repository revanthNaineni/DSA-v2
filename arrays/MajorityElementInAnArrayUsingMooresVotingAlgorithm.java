package arrays;

public class MajorityElementInAnArrayUsingMooresVotingAlgorithm {
    public static void main(String[] args) {

        int [] nums={3, 2, 3, 1, 3, 4, 3, 5};
        int majorityElementInAnArray = majorityElementInAnArray(nums);
        System.out.println(majorityElementInAnArray);
    }
    public static int majorityElementInAnArray(int[] nums) {
        int majorityNo = nums[0];
        int count = 1;
            for (int i = 1; i < nums.length; i++) {
                if(count==0){
                    majorityNo=nums[i];
                    count=1;
                }
                if(nums[i]==majorityNo){
                    count++;
                }else {
                    count--;
                }
            }
                return majorityNo;
    }
}
