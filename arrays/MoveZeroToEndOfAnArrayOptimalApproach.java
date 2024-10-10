package arrays;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroToEndOfAnArrayOptimalApproach {

	public static void main(String[] args) {


		int arr[] = { 1, 3, 0, 6, 4, 0,0, 0, 9, 0, -1 };
		moveZerosToEnd(arr);
		for (int i : arr) {
			System.out.println(i);
		}

	}
	
	public static void moveZerosToEnd(int[] nums) {
        int snowBallSize = 0; 
        for (int i=0;i<nums.length;i++){
	        if (nums[i]==0){
                snowBallSize++; 
            }
            else if (snowBallSize > 0) {
	            int t = nums[i];
	            nums[i]=0;
	            nums[i-snowBallSize]=t;
            }
        }
    }


}
