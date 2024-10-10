package arrays.leetcodePractice;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        System.out.println(isContainsDuplicate(nums));

    }

    public static boolean isContainsDuplicate(int[] nums){
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        return nums.length != set.size();
    }
}
