import java.util.Scanner;
public class TwoDarray_ops{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the rows and columns for Matrix A: ");
		int rowsA=sc.nextInt();
		int colsA=sc.nextInt();
		
		int [][] A=new int[rowsA][colsA];
		System.out.println("enter the elements of MatrixA :");
		for(int i=0;i<rowsA;i++){
			for(int j = 0;j<colsA;j++){
				A[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("enter the rows and columns for MatrixB");
		int rowsB = sc.nextInt();
		int colsB= sc.nextInt();
		
		int [][] B=new int[rowsB][colsB];
		System.out.println("enter the elements for Matrix B: ");
		for(int i =0;i<rowsB;i++){
			for(int j =0;j<colsB;j++){
				B[i][j] = sc.nextInt();
			}
		}
		
		if(rowsA==rowsB && colsA==colsB){
			System.out.println("\nAddition of Matrices : ");
			int [][] sum = MatrixOperations.add(A,B);
			MatrixOperations.printMatrix(sum);
		}else{
			System.out.println("\n Addition not possible rows and cols not matched");
		}
		
		if(colsA==rowsB){
			System.out.println("\nMultiplication of matrices  :");
			int [][] mul = MatrixOperations.multiply(A,B);
			MatrixOperations.printMatrix(mul);
		}else{
			System.out.println("\nmultiplication not possible");
		}
		
		System.out.println("Transpose of MatrixA : ");
		int [][] transposeA = MatrixOperations.transpose(A);
		MatrixOperations.printMatrix(transposeA);
		
		System.out.println("Transpose of MatrixB : ");
		int [][] transposeB = MatrixOperations.transpose(B);
		MatrixOperations.printMatrix(transposeB);
		
		sc.close();
	}
}
