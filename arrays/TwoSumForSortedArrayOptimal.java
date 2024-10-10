package arrays;

public class TwoSumForSortedArrayOptimal {

	public static void main(String[] args) {
		int numbers []= {2,7,11,15};
		int target=9;
		
		int[] twoSum = twoSum(numbers, target);
		for (int i : twoSum) {
			System.out.println(i);
		}
	}

	private static int [] twoSum(int[] numbers, int target) {
		int left=0;
        int right=numbers.length-1;
        while(numbers[left]+numbers[right]!=target){
           if(numbers[left]+numbers[right]<target){
               left++;
           }else{
               right--;
           }
        }
        
        return new int [] {left+1,right+1};
	}

}
