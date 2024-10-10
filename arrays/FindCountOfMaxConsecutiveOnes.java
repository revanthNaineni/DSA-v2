package arrays;

/*Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.*/


public class FindCountOfMaxConsecutiveOnes {

	public static void main(String[] args) {
		int nums []= {1,1,0,1,1,1,1,0,1,1,0,0,1,1,1,1,1,1,1};
		System.out.println(findCountOfMaxConsecutiveOnes(nums));

	}
	
	public static int findCountOfMaxConsecutiveOnes(int nums []) {
		
		int count=0;
		int max=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==1) {
				count++;
				if(max<count) {
					max++;
				}
			}else {
				count=0;
			}
		}
		return max;
	}

}
