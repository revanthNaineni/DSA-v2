package arrays.practice;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArrayOptimal {

    public static void main(String[] args) {
        int[] nums={-3, 4, 5, 1, -30, -10};
        int[] fetchLeaders = fetchLeaders(nums);
        for (int i : fetchLeaders) {
            System.out.println(i);
        }
    }

    //1, 2, 8, 6, 4, 2

    private static int [] fetchLeaders(int[] nums){
        List<Integer> list=new ArrayList<>();
        int leader=nums[nums.length-1];
        list.add(leader);
        for (int i = nums.length-2; i >=0 ; i--) {
            if(nums[i]>leader){
                list.add(nums[i]);
                leader=nums[i];
            }

        }

        int[] leaderArr= new int[list.size()];
        int count=0;
        for(Integer i:list){
            leaderArr[count++]=i;
        }

        return leaderArr;

    }

}
