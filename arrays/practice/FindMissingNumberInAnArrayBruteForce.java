package arrays.practice;

public class FindMissingNumberInAnArrayBruteForce {
    public static void main(String[] args) {
        int[] nums={0, 1, 2, 4, 5, 6};
        System.out.println(findMissingNumber(nums));
    }
    
    public static int findMissingNumber(int[] nums){

        int missingNo=-1;
        for (int i = 0; i <= nums.length; i++) {
            boolean flag=false;
            for (int j = 0; j < nums.length; j++) {
                if(i==nums[j]){
                    flag=true;
                }
            }
            if(!flag){
                missingNo= i;
            }
        }
        return missingNo;
    }
}
