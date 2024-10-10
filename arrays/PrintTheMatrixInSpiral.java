package arrays;

import java.util.ArrayList;
import java.util.List;

public class PrintTheMatrixInSpiral {

	public static void main(String[] args) {
		int[][] mat = {
	            {1, 2, 3, 4},
	            {5, 6, 7, 8},
	            {9, 10, 11, 12},
	            {13, 14, 15, 16}
	        };
		
			int n = mat.length;
			int m = mat[0].length;

			int left = 0, right = m - 1;
			int top = 0, bottom = n - 1;
			
			List<Integer> list=new ArrayList<Integer>();
			
			while(left<=right && top<=bottom) {
				//print left to right
				for (int i = left; i <=right; i++) {
					list.add(mat[top][i]);
				}
				top++;
				
				//print top to bottom
				for (int i = top; i <=bottom; i++) {
					list.add(mat[i][right]);
				}
				right--;
				
				//print right to left
				for (int i = right; i >= left; i--) {
					list.add(mat[bottom][i]);
				}
				bottom--;
				
				//print bottom to top
				for (int i = bottom; i>=top; i--) {
					list.add(mat[i][left]);
					
				}
				left++;
			}
			
			System.out.println(list);
		
		
	}

}
