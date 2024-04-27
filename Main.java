package opac;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice,k=1,n = 0;

		Library ob = new Library();

		while(k!=0) {
			System.out.println("Enter the number of operation you want to perform:");
			System.out.println("1.Accept the book details");
			System.out.println("2.Display the book details");
			System.out.println("3.Enter ISBN number to search a book");
			System.out.println("4.Search an author and find all his/her books");
			System.out.println("5.Sort books by ISBN number\n");
			choice=sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("\nEnter the number of books:");
					n= sc.nextInt();
					ob.AcceptBookDetails(n);
					break;
					
				case 2:
					ob.DisplayBookDetails(n);
					break;
				
				case 3:
					ob.searchByISBN(n);
					break;
				
				case 4:
					ob.searchByAuthor(n);
					break;

				case 5:
					ob.sortByISBN(n);
			}
			
			System.out.println("\nDo you wish to continue? \nPress 1 to continue and 0 to exit\n");
			k = sc.nextInt();
			
			if(k==0){
				System.out.println("\nTHANK YOU !\n");
			}
		}
		sc.close();
	}
}
