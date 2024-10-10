package arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementInAnArrayBetter {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int majorityElementInAnArray = majorityElementInAnArray(nums);
        System.out.println(majorityElementInAnArray);
    }
    public static int majorityElementInAnArray(int[] nums) {
        int majorityNo = Integer.MIN_VALUE;
        int maxCount = 0;
        if(nums.length==1){
            return nums[0];
        }else {
            for (int i = 0; i < nums.length - 1; i++) {
                int count = 1;
                if(nums[i]==majorityNo){
                    continue;
                }
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
}
