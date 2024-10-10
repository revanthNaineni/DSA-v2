package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementInAnArrayType2Better {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 3, 2, 2};
        List<Integer> list = majorityElementInAnArray(nums);
        System.out.println(list);
    }

    public static List<Integer> majorityElementInAnArray(int[] nums) {
        int freq=nums.length/3;
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();

        for (int j : nums) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        System.out.println(map);
        for ( int n: map.keySet()) {
            if(map.get(n)>freq){
                list.add(n);
            }
        }
        return list;


    }
}
