public class MatrixMultiplication{
	public static void main(String[] args){
		int r1 = 2,c1 = 3;
		int r2 = 3,c2 = 2;
	    int[][] firstMatrix = {{3,4,5},{3,0,9}};
	    int[][] secondMatrix ={{2,3,},{-9,8},{3,6}};
		
		int[][] product = new int[r1][c2];
		for(int i = 0;i<r1;i++){
			for(int j = 0;j<c2;j++){
				for(int k =0;k<c1;k++){
					product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
				}
			}
		}
		
		System.out.println("multiplication of two matrices is : ");
		for(int[] row : product){
			for(int column : row){
				System.out.print(column + " ");
			}
			System.out.println();
		}
		
	
	}
}