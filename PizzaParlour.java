package assignment5;
import java.util.*;

public class PizzaParlour {

	public static void main(String[] args) {
		
		 OrderSystem os = new OrderSystem(50);
	     Scanner sc = new Scanner(System.in);
	       
	     int x=1,ch=0;
	     do{
	    	 System.out.println("\n**********MENU**********\n1.Place Pizza Order\n2.Deliver Pizza Order");
	         ch=sc.nextInt();
	         switch(ch){
	         
	         case 1:
	        	 os.placeOrder();
	        	 break;
	                    
	         case 2:
	        	 os.deliverOrder();
	             break;
	                   
	         default:
	        	 System.out.println("\nINVALID INPUT");
	         }
	         System.out.println("\nDo you want to continue?\nPress 1 to continue\nPress 0 to exit\n");
	         x = sc.nextInt();
	    }
	     while(x!=0);
	        
	     if(x==0){
	            System.out.println("\nThank you!\nVisit again soon!\n\n**********END OF PROGRAM**********");
	        }
	     sc.close();
	  }	
}
