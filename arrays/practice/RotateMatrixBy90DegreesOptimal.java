package arrays.practice;

/*The idea was firstly transpose the matrix and then flip it symmetrically. For instance,

1  2  3             
4  5  6
7  8  9
after transpose, it will be swap(matrix[i][j], matrix[j][i])

1  4  7
2  5  8
3  6  9
Then flip the matrix horizontally. (swap(matrix[i][j], matrix[i][matrix.length-1-j])

7  4  1
8  5  2
9  6  3*/

public class RotateMatrixBy90DegreesOptimal {

	public static void main(String[] args) {
		 int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	        
	        // Create an instance of the Solution class
	        
	        // Rotate the matrix
	        rotate(arr);
	        
	        // Output the rotated matrix
	        System.out.println("Rotated Image:");
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[0].length; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	
	    //Rotate the given matrix by 90 degrees clockwise.
	    
	    public static void rotate(int[][] matrix) {
	        int n = matrix.length;

	        // Transpose the matrix
			for(int i=0;i<matrix.length;i++){
				for(int j=0; j<i; j++){
					if(i!=j){
						int temp=matrix[j][i];
						matrix[j][i]=matrix[i][j];
						matrix[i][j]=temp;
					}
				}
			}

	        // Reverse each row of the matrix
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n / 2; j++) {

	                // Swap elements symmetrically
	                int temp = matrix[i][j];
	                matrix[i][j] = matrix[i][n - 1 - j];
	                matrix[i][n - 1 - j] = temp;

	            }
	        }
	    }

}
