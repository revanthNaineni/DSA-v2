package arrays;

/*Given an integer array nums of even length consisting of an equal number of positive and negative integers.Return the answer array in such a way that the given conditions are met:



Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.

Example 1
Input : nums = [2, 4, 5, -1, -3, -4]

Output : [2, -1, 4, -3, 5, -4]

Explanation: The positive number 2, 4, 5 maintain their relative positions and -1, -3, -4 maintain their relative positions
*/
public class RearrangeArrayElementsBySignOptimal {

	public static void main(String[] args) {

		int nums[] = { -8,2, 4, 5, -1, -3, -4,48 };
		int tempArr[] = new int[nums.length];
		
		int positive=0;
		int negative=1;

		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>0) {
				tempArr[positive]=nums[i];
				positive+=2;
			}else {
				tempArr[negative]=nums[i];
				negative+=2;
			}
		}
		
		for (int i : tempArr) {
			System.out.println(i);
		}

	}

}
