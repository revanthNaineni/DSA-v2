package arrays;

import java.util.ArrayList;
import java.util.List;

public class FindnthRowInPascalTriangle {

	public static void main(String[] args) {
		int row = 2;
		List<Integer> list = getRow(row);
		System.out.println(list);
	}
	
	/*Ex: row=5
	 *  5C0 5C1 5C2 5C3 5C4 5C5
	 *  
	 *  1 5/1  5*4/2*1  5*4*3/3*2*1 .....
	 *  
	 *  1  5/1=> ((row+1)-1)/1 5*4/2*1=> ((row+1)-2)/2
	 * 
	 */

	public static List<Integer> getRow(int rowIndex) {

		long ans = 1;
		List<Integer> list = new ArrayList<>();
		list.add(1);
		for (int i = 1; i < rowIndex + 1; i++) {
			ans = ans * (rowIndex + 1 - i);
			ans = ans / i;
			list.add((int) ans);
		}
		return list;

	}

}
