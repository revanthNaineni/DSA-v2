package arrays.leetcodePractice;

public class SearchInsertPositionBruteForce {
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target=7;
        System.out.println(searchInsertPosition(nums,target));

    }
    public static int searchInsertPosition(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }else if(nums[i]>target){
                return i;
            }else if(nums[i]< target && i==nums.length-1){
                return nums.length;
            }
        }

        return -1;
    }
}
