public class MatrixOperations{
	public static int[][] add(int [][] A ,int [][] B){
		int rows = A.length;
		int cols = A[0].length;
		int [][] result = new int[rows][cols];
		
		for(int i= 0;i<rows;i++){
			for(int j=0;j<cols;j++){
				result[i][j] = A[i][j] + B[i][j];
			}
		}
		return result;
	}
	
	public static int [][] multiply(int [][] A,int [][] B){
		int rowsA = A.length;
		int colsA = A[0].length;
		int colsB = B[0].length;
		int [][] result = new int [rowsA][colsB];
		
		for(int i =0;i<rowsA;i++){
			for(int j=0;j<colsB;j++){
				for(int k=0;k<colsA;k++){
					result[i][j] += A[i][k]*B[k][j];
				}
			}
		}
		return result;
	}
	public static int[][] transpose(int[][] A){
		int rows=A.length;
		int cols = A[0].length;
		int[][] result = new int [cols][rows];
		for(int i = 0;i<rows;i++){
			for(int j =0;j<cols;j++){
				result[j][i] = A[i][j];
			}
		}
		return result;
	}
	public static void printMatrix(int [][] matrix){
		for(int [] row : matrix){
			for(int val : row){
				System.out.print(val + "\t");
			System.out.println();
			}
		}
	}
}