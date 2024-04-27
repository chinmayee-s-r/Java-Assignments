package mock_ds;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Graph g = new Graph();
		int ch=0;
		do {
		System.out.println("\n***************WELCOME TO NEWSPAPER SYSTEM***************\n1)Create adjacency matrix and perform DFS\n" + "0)Exit\nEnter your choice : ");

		ch=sc.nextInt();

		switch(ch) {
			case 1:
				g.createUsingAdjMat();
				g.displayAdjMat();
				System.out.println("Enter starting vertex:");
				int str1=sc.nextInt();
				g.dfs(str1);
				break;
		
		
			case 0:
				System.out.println("Thank you!!!");
			}
		} while(ch!=0);
		sc.close();
}
}
