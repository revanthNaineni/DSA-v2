package arrays.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MoveZerosToTheEndBruteForce {
    public static void main(String[] args) {
        int[] nums={0, 1, 4, 0, 5, 2};
        moveZerosToEnd(nums);

    }

    public static void moveZerosToEnd(int[] nums){

        List<Integer> nonZeros= new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nonZeros.add(nums[i]);
            }

        }

        for (int i = nonZeros.size(); i < nums.length; i++) {
            if(nums[i]!=0){
                nonZeros.add(0);
            }

        }

        System.out.println(nonZeros);
    }
}
