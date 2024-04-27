package assignment1;
import java.util.*;

public class Matrix {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator obj = new Calculator();
		
		int yourchoice;
		
		obj.accept_values();
		obj.display();
		
		do{
			System.out.println ("\nEnter your choice");
			System.out.println ("1.Check if matrix is square matrix.");
			System.out.println ("2.Check if matrix is upper triangular.");
			System.out.println ("3.Compute transpose of the matrix.");
			System.out.println ("4.Add two matrices.");
			System.out.println ("5.Multiply two matrices.");
			int choice = scan.nextInt ();
			
			switch (choice){
			
			case 1:
				obj.square();
				break;
				
			case 2:
				obj.upper_triangular();
				break;
				
			case 3:
				obj.transpose();
				break;
				
			case 4:
				obj.addition();
				break;
				
			case 5:
				obj.multiplication();
				break;
			}
			
			System.out.println ("\nDo you want to continue?");
			System.out.println ("Press 1 to continue.");
			System.out.println ("Press 2 to end.");
			yourchoice = scan.nextInt ();
		}
		while (yourchoice == 1);
		
		if (yourchoice == 2)
		System.out.println ("THANK YOU");
	}
	
}

