package arrays.practice;

import java.util.*;

public class TwoSumBetter {

	public static void main(String[] args) {

		int[] nums = {1,9, 2, 10, 3,6};
		int target=7;

		int[] twoSum = twoSum(nums, target);

		for(int i:twoSum){
			System.out.println(i);
		}

	}
	private static int [] twoSum(int[] nums, int target) {

		Map<Integer,Integer> map=new HashMap<>();
		int[] tempArr=new int[2];

		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(target-nums[i])){
				tempArr[0]=map.get(target-nums[i]);
				tempArr[1]=nums[i];
				break;
			}
			map.put(nums[i],1 );

		}
		return tempArr;
	}


}
