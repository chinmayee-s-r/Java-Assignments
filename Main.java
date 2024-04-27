package dslab4;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int choice;
	        Stack obj = new Stack(50);
	        System.out.println("----STACK----");
	        do {
	            System.out.println("1. EVALUATE\n2. REVERSE\n3. EXIT");
	            System.out.print("Choose an option: ");
	            choice = sc.nextInt();
	            sc.nextLine(); // Consume the newline character

	            switch (choice) {
	                case 1:
	                	 System.out.print("Enter the expression character by character (end with '='): ");
	                     String expr = "";
	                     char ch;
	                     do {
	                         ch = sc.next().charAt(0);
	                         expr += ch;//adding all char in String expr. 
	                     } while (ch != '=');
	                     obj.evaluate(expr);
	                     break;
	                case 2:
	                    System.out.print("Enter a string to reverse: ");
	                    String str = sc.nextLine();
	                    obj.reverse(str);
	                    break;
	                case 3:
	                    System.out.println("Program end.");
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice !!!");
	            }
	        } 
	        
	        while (choice != 3);
	}

}
