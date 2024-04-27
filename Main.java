package assignment7;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();      // object of BinarySearchTree class
        Scanner sc = new Scanner(System.in);
        int ch;
        do{
            System.out.println("\n*********************************************\n\t\tMENU\n*********************************************\nEnter 1 to create a dictionary\n" +
                               "Enter 2 to search a word\n"  +  
                               "Enter 3 to update dictionary\n" +
                               "Enter 4 to delete a word\n" +
                               "Enter 0 to quit.\n*********************************************");
            System.out.println("Enter the choice: ");
            ch = sc.nextInt();
            sc.nextLine();

            if (ch == 0)
                break;

            switch(ch){
                case 1 :
                    tree.create();         // calling create function
                    break;
                case 2: 
                    tree.search();         // calling search function
                    break;
                case 3:
                    tree.update();         // calling update function
                    break;
                case 4:
                    tree.delete();         // calling delete function
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        } while(ch!= 0);
        sc.close();
    }
}
