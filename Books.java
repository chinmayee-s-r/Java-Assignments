package opac;
import java.util.Scanner;
public class Books {
	String BookName;
	String AuthorName;
	String PubName;
	int ISBNNo;
	
	Books(){
		BookName="";
		AuthorName="";
		PubName="";
		ISBNNo=0;
	}
}


class Library {
	Scanner sc = new Scanner(System.in);
	Books[] book = new Books[50];
	
	void AcceptBookDetails(int n){
		for(int i=0;i<n;i++){
			book[i] = new Books();
			System.out.println("\nEnter book "+(i+1)+" details");
			System.out.println("\nEnter the book name:");
			book[i].BookName=sc.nextLine();
			System.out.println("\nEnter the authors name:");
			book[i].AuthorName=sc.nextLine();
			System.out.println("\nEnter the ISBN number:");
			book[i].ISBNNo=sc.nextInt();
			System.out.println("\nEnter the publication name:");
			book[i].PubName=sc.nextLine();
			book[i].PubName=sc.nextLine();
		}
	}

	void DisplayBookDetails(int n){
		for(int i=0;i<n;i++){
			System.out.println("\nBook "+(i+1)+" details : \n");
			System.out.println("Book Name: "+book[i].BookName);
			System.out.println("Author name: "+book[i].AuthorName);
			System.out.println("ISBN: "+book[i].ISBNNo);
			System.out.println("Publication number: "+book[i].PubName);
		}
	}

	void searchByISBN(int n) {
		System.out.println("\nEnter ISBN number : ");
		int isbn = sc.nextInt();

		//Sequential search
		
		for(int i =0;i<n;i++) {
			if(book[i].ISBNNo==isbn) {
				System.out.println("\nThe book is found at index "+(i+1)+"\nBook name : "+
						book[i].BookName+"\nAuthor's Name : "+book[i].AuthorName+"\nPublication Name : "
						+book[i].PubName);
				return;
			}
		}
		System.out.println("Book not found!\n");
	}

	void searchByAuthor(int n) {
		int x=0;
		System.out.println("\nEnter author's name : ");
		String an = sc.next();

		//Sequential search

		for(int i=0;i<n;i++) {
			if(book[i].AuthorName.contains(an)) {
				x++;
				if(x==1) {
					System.out.println("\nBooks written by "+an+" are : ");
				}
				System.out.println(book[i].BookName);
			}
		}
		if(x==0) {
			System.out.println("No books found !\n");
		}
	}

	void sortByISBN(int n) {

		//Selection sort

		for(int i=0;i<n-1;i++) {
			int min = i;
			for(int j =i+1;j<n;j++) {
				if(book[j].ISBNNo<book[min].ISBNNo) {
					min =j;
					Books b = book[min];
					book[min]=book[i];
					book[i]=b;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(book[i].BookName+" : "+book[i].ISBNNo+" \n");
		}
	}
}

