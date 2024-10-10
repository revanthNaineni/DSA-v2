package arrays.practice;

import java.util.ArrayList;
import java.util.List;

public class MoveZerosToTheEndOptimal {
    public static void main(String[] args) {
        int[] nums={1, 1, 4, 0,0,0, 2};
        int[] nums1 = moveZerosToEnd(nums);
        for(int i:nums1){
            System.out.println(i);
        }


    }

    public static int[] moveZerosToEnd(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==0 && nums[i+1]!=0){
                int temp=nums[i+1];
                nums[i+1]=nums[i];
                nums[i]=temp;
            }
        }
        return nums;
    }

}
