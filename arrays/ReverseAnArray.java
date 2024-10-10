package arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		int nums[] = { -3, 4, 5, 1, -4, -5 };
		for (int i = 0; i < nums.length/2; i++) {
			
			int temp=nums[i];
			nums[i]=nums[nums.length-1-i];
			nums[nums.length-1-i]=temp;
			
		}
		for (int i : nums) {
			System.out.println(i);
		}
	}

}
