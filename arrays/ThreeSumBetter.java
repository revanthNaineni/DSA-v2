package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ThreeSumBetter {

	public static void main(String[] args) {
		int nums[] = { 2, -2, 0, 3, -3, 5,3,-3 };
		List<List<Integer>> threeSum = threeSum(nums);
		System.out.println(threeSum);
	}
	
	public static List<List<Integer>> threeSum(int [] nums) {
		
		Map<Integer, Integer> map= new HashMap<Integer, Integer>();
		Set<List<Integer>> set=new HashSet<List<Integer>>();
		
		
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(map.containsKey(-(nums[i]+nums[j]))) {
					List<Integer> list=new ArrayList<Integer>();
					if(i!=j && j!=i+j && i+j!=i) {
					list.add(nums[i]);
					list.add(nums[j]);
					list.add(-(nums[i]+nums[j]));
					Collections.sort(list);
					set.add(list);
					}
				}
				map.put(nums[i], i);
				
			}
			
		}
		List<List<Integer>>  lists=new ArrayList<List<Integer>>(set);
		return lists;
		
	}

}
