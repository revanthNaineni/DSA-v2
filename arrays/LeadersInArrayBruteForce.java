package arrays;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArrayBruteForce {

    public static void main(String[] args) {
        int[] nums={-3, 4, 5, 1, -30, -10};
        int[] fetchLeaders = fetchLeaders(nums);
        for (int i : fetchLeaders) {
            System.out.println(i);
        }
    }

    private static int [] fetchLeaders(int[] nums){
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums.length-1; i++) {
            int count=0;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]>nums[j]){
                    count++;
                }else{
                    break;
                }
            }
            if(count== nums.length-1-i){
                list.add(nums[i]);
            }

        }

        list.add(nums[nums.length-1]);

        int[] leaderArray=new int[list.size()];
        int count=0;
        for(Integer i:list){
            leaderArray[count++]=i;
        }

        return leaderArray;
    }

}
