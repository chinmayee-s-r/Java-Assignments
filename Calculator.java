package assignment1;
import java.util.*;

public class Calculator {
Scanner sc = new Scanner(System.in);
	
	int i,j;
	int rows, columns;
	int matrix1[][];
	
	void accept_values() {
	    System.out.println("Enter no. of rows for Matrix : ");
	    rows = sc.nextInt();
	    System.out.println("Enter no. of columns for Matrix : ");
	    columns = sc.nextInt();
	    matrix1 = new int[rows][columns]; // Use the class-level variable
	    System.out.println ("Enter elements of the Matrix : ");
	    for (i = 0; i < rows; i++) {
	        for (j = 0; j < columns; j++) {
	            matrix1[i][j] = sc.nextInt ();
	        }
	    }
	}

	void display() {
	    System.out.println("\n The Matrix is: ");
	    for (i = 0; i < rows; i++) {
	        for (j = 0; j < columns; j++) {
	            System.out.print(matrix1[i][j] + " ");
	        }
	        System.out.println(); // Move to the next row
	    }
	    System.out.println("\n");
	}
	
	void square() {
		
		if (rows == columns) {
			System.out.println("This is a square matrix.");
		}
		else {
			System.out.println("This is not a square matrix.");
		}
	}
	
	void upper_triangular() {
		
		int ut_matrix = 1;
		
		if (rows == columns){
			for (i = 0; i < rows; i++){
				for (j = 0; j < columns; j++){
					if((j<i) && (matrix1[i][j]==0))
						ut_matrix = 1;
					else
						ut_matrix= 0;
					}
				}
			if (ut_matrix == 1)
				System.out.println ("\nThe given matrix is an Upper triangle.");
			else
				System.out.println ("\nThe given matrix is not an Upper triangle.");
			}
		else
			System.out.println ("\nThe given matrix is not an Upper triangle.");
	}
	
	void transpose() {
		
		for (i = 0; i < columns; i++){
			for (j = 0; j < rows; j++){
				System.out.print (matrix1[j][i] + " ");
				}
			System.out.println ();
		}
	}

	void addition() {
		
		int matrix2[][] = new int[rows][columns];
		
		System.out.println ("Enter elements of the second Matrix : ");
		for (i = 0; i < rows; i++){
			for (j = 0; j < columns; j++) {
				matrix2[i][j] = sc.nextInt ();
				}
		}

		int sum[][] = new int[rows][columns];
		for (i = 0; i < rows; i++){
			for (j = 0; j < columns; j++){
				sum[i][j] = matrix2[i][j] + matrix1[i][j];
				System.out.print(sum[i][j] + " ");
		    }
		System.out.println ();
		}
	}
	
	void multiplication() {
		
		System.out.println("Enter no. of columns for second Matrix : ");
		int newcol = sc.nextInt();
		
		int matrix3[][] = new int[columns][newcol];
		System.out.println ("Enter elements of second Matrix : ");
		for (i = 0; i < columns; i++){
			for (j = 0; j < newcol; j++){
				matrix3[i][j] = sc.nextInt ();
		    }
		}
		
		int product[][]=new int[rows][newcol];
		for (int i = 0; i < rows; i++){
			for (int j = 0; j < newcol; j++){
				product[i][j] = 0;
				for (int k = 0; k < columns; k++){
					product[i][j] += matrix1[i][k] * matrix3[k][j];
					}
				System.out.print(product[i][j] + " ");
				}
			System.out.println();
		}
	}
}
