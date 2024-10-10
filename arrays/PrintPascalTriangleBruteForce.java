package arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintPascalTriangleBruteForce {

	public static void main(String[] args) {
		int rows = 12;

		List<List<Integer>> lists=new ArrayList<List<Integer>>();
		for (int i = 1; i <= rows; i++) {
			List<Integer> list=new ArrayList<Integer>();
			for (int j = 1; j <= i; j++) {
				list.add((int) getElement(i-1, j-1));
			}
			lists.add(list);
		}
		
		System.out.println(lists);
	}
	
	public static long getElement(int row , int col) {
		int res = 1;
		for (int i = 0; i < col; i++) {
			res = res * (row - i);
			res = res / (i + 1);

		}
		return res;
		
	}

}
