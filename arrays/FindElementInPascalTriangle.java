package arrays;

/*Given the row number r and the column number c, find out the element at position (r , c) in Pascal Triangle.

Intuition 
The idea is to use an optimal formula of nCr to solve this problem.

Approach 
Consider r-1 as n and c-1 as r in the formula of nCr. After that, simply calculate the value of the combination using a loop.
Iterate from 0 to r using a variable say i, and in each iteration, multiply (n - i) with the result and divide the result by (i + 1). Finally, the calculated value of the combination will be the answer.

Ex for Combinations: 5C2=5!/2!*(5-2)! => 5*4/2*1
*/
public class FindElementInPascalTriangle {

	public static void main(String[] args) {

		int row = 1;
		int column = 1;

		findElementFromPascalTriangle(row - 1, column - 1);

	}

	private static void findElementFromPascalTriangle(int row, int column) {
		int res = 1;
		for (int i = 0; i < column; i++) {
			res = res * (row - i);
			res = res / (i + 1);

		}

		System.out.println(res);
	}

}
