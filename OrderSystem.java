package assignment5;
import java.util.Scanner;

public class OrderSystem {
	Scanner sc=new Scanner(System.in);
    int front,rear,size,total;
   
    Pizza order_list[];
   
    public OrderSystem(int q_size){
        front=0;
        rear=0;
        size=q_size;
        total=0;
        //q_size=50;
        order_list=new Pizza[q_size];
    }
   
    
    boolean isFull(){
        if(rear==size){
            return true;
        }
        else{
            return false;
        }
    }
   
    
    boolean isEmpty(){
        if(front==rear){
            return true;
        }
        else{
            return false;  
        }
    }
   
    
    
    void placeOrder(){                		//Enqueue
        total=0;
        order_list=new Pizza[50];
        if(isFull()==true){
            System.out.println("\nOrders are full.Please wait.Sorry for the inconvenience");
        }
        
        else{
        	System.out.println("******************** MENU ********************");
            System.out.println("Pizza\t\t\tQuantity\t\tPrice\t\t\nMargerita\t\tsmall\t\t\t99\n         \t\tmedium\t\t\t199\n         \t\tlarge\t\t\t299");
            System.out.println("**************************************************");
            System.out.println("Pizza\t\t\tQuantity\t\tPrice\t\t\nFarmhouse\t\tsmall\t\t\t199\n        \t\tmedium\t\t\t299\n         \t\tlarge\t\t\t399");
            System.out.println("**************************************************");
            System.out.println("Pizza\t\t\tQuantity\t\tPrice\t\t\nDeluxe\t\t\tsmall\t\t\t299\n         \t\tmedium\t\t\t399\n         \t\tlarge\t\t\t499");
            System.out.println("**************************************************");
            System.out.println("Enter the number of pizzas you wish to order -");
           
            int pn=sc.nextInt();
                    
            for(int i=1;i<=pn;i++){
            	Pizza a1=new Pizza();
            	System.out.println("Enter pizza you want to order-");
            	a1.pizzaname=sc.next();
            	
            	//str1.equals(str2);
            	
            	
            	if(a1.pizzaname.equalsIgnoreCase("Margerita")){
            		 System.out.println("Enter the pizza size you wish to order-(s=small,m=medium,l=large)");
                     a1.size=sc.next().charAt(0);
                     if((a1.size=='s')||(a1.size=='m')||(a1.size=='l')){
                         if(a1.size=='s'){
                             a1.price=99;
                         }
                         else if(a1.size=='m'){
                             a1.price=199;
                         }
                         else if(a1.size=='l'){
                             a1.price=299;
                         }
                         order_list[rear++]=a1;
                     }
                     else{
                         System.out.println(a1.size+" size is not available.Please try again.");
                         break;
                     }
             }
            	
            	
            	else if(a1.pizzaname.equalsIgnoreCase("Farmhouse")){
                     System.out.println("Enter the pizza size you wish to order-(s=small,m=medium,l=large)");
                     a1.size=sc.next().charAt(0);
                     if((a1.size=='s')||(a1.size=='m')||(a1.size=='l')){
                         if(a1.size=='s'){
                             a1.price=199;
                         }
                         else if(a1.size=='m'){
                             a1.price=299;
                         }
                         else if(a1.size=='l'){
                             a1.price=399;
                         }
                         order_list[rear++]=a1;
                     }
                     
                     else{
                         System.out.println(a1.size+" size is not available.Please try again.");
                         break;
                     }
                  }
            	
            	
             else if(a1.pizzaname.equalsIgnoreCase("Deluxe")){
                     System.out.println("Enter the pizza size you wish to order-(s=small,m=medium,l=large)");
                     a1.size=sc.next().charAt(0);
                     if((a1.size=='s')||(a1.size=='m')||(a1.size=='l')){
                         if(a1.size=='s'){
                             a1.price=299;
                         }
                         else if(a1.size=='m'){
                             a1.price=399;
                         }
                         else if(a1.size=='l'){
                             a1.price=499;
                         }
                         order_list[rear]=a1;
                         rear++;
                     }
                     else{
                         System.out.println(a1.size+" size is not available.Please try again.");
                         break;
                     }
             }
            	
            	
             else{
                 System.out.println(a1.pizzaname+" pizza is not available.Please try again.");
                 break;
             }
            	
             total=total+a1.price;
             displayOrder();
             System.out.printf("\n___________________\nTotal amount - %d\n\n",total);
             System.out.println("Thank you for ordering ! Your order will be delivered shortly.");
            }
        }
    }

    
    
    void deliverOrder(){			 	   //Dequeue
    	
    	if(isEmpty()==true){
    		System.out.println("All the orders are successfully delivered.There are no orders to be delivered.Thank you!");
    		}
    	
    	else{
    		for(int j=front;j<rear;j++){
                 if(j==0){
                     System.out.println("\nDelivered items are -");
                 }
                 System.out.printf("\n%d pizza name-%s\nPizza size-%c\nPizza price-%d\n",j+1,order_list[j].pizzaname,order_list[j].size,order_list[j].price);
                 front++;
             }
             System.out.printf("\n___________________\nTotal amount paid- %d\n\n",total);
             total=0;
    	}
    }


    void displayOrder(){  				   //all the orders present in the Queue
    	//front=0;
    	for(int i=front;i<rear;i++){
    		if(i==0){
    			System.out.println("\nOrdered items are -");
    			}
    		System.out.printf("\n%d Pizza name-%s\nPizza size-%c\nPizza price-%d\n",i+1,order_list[i].pizzaname,order_list[i].size,order_list[i].price);
    		}
    	}
    }
