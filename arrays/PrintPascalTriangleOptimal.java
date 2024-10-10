package arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintPascalTriangleOptimal {

	public static void main(String[] args) {

		int rows = 5;
		
		List<List<Integer>> lists= new ArrayList<List<Integer>>();

		for (int i = 1; i <= rows; i++) {
			lists.add(getRows(i));
		}
		
		System.out.println(lists);

	}

	public static List<Integer> getRows(int rows) {

		long res = 1;
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		for (int i = 1; i < rows; i++) {
			res = (res * (rows - i)) / i;
			list.add((int) res);
		}
		return list;

	}

}
