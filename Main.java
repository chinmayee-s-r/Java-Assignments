package assignment6;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		BTree bt = new BTree();
		Scanner sc = new Scanner(System.in);
		int x=1;
		while (x==1)
		{
		    System.out.println("****************************************************");
			System.out.println("Menu: ");
			System.out.println("1.Create binary tree");
			System.out.println("2.Recursive inorder traversal.");
			System.out.println("3.Non-recursive inorder traversal.");
			System.out.println("4.Recursive preorder traversal.");
			System.out.println("5.Non-recursive preorder traversal.");
			System.out.println("6.Recursive post order traversal.");
			System.out.println("7.Non-recursive post order traversal.");
			System.out.println("8.Exit.\n");
			System.out.println("****************************************************\n");
			System.out.print("Enter your choice: ");
			int a =sc.nextInt();
			System.out.println(" ");
			
			switch(a)
			{
			case 1: 
				 bt.create();
				 break;
			 case 2:
				 bt.recursive_Inorder(bt.root); 
				 System.out.println();
				 break;
			 case 3:
				 bt.nonRecursive_Inorder();
				 System.out.println();
				 break;
			 case 4:
				 bt.recursive_Preorder(bt.root);
				 System.out.println();
				 break;
			 case 5:
				 bt.nonRecursive_Preorder();
				 System.out.println();
				 break;
			 case 6:
				 bt.recursive_Postorder(bt.root);
				 System.out.println();
				 break;
			 case 7: 
				 bt.nonRecursive_Postorder();
				 System.out.println();
				 break;
			 case 8:
				 System.out.println("***********************************\nPROGRAM ENDED\n");
				 System.exit(0);
				 break;
			 default:
				 System.out.println("INVALID CHOICE.\n");	  
			}
		}		
	}
}
