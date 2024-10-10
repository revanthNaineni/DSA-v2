package arrays.practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArrayBruteForce {
    public static void main(String[] args) {
        //7671061460
        int[] nums={0, 0, 3, 3, 5, 6};
        int[] nums1 = removeDuplicates(nums);
        for(int i:nums1){
            System.out.println(i);
        }
    }

    public static int[] removeDuplicates(int[] nums){
        Set<Integer> set=new LinkedHashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int count=0;
        for(Integer i:set){
            nums[count++]=i;
        }

        for (int j = set.size(); j < nums.length; j++) {
            nums[j]=9999;
        }

        return nums;
    }
}
