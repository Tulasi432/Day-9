package com.codegnan.controlstatements;
import java.util.Scanner; 

public class CanteenSystem {

	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 int teaprice = 10, coffeprice = 15, samosaprice = 20;
	 int teaQty=0,coffeQty=0,samosaQty=0;
	 int choice;
	 double taxRate=0.05;
	 do {
		 System.out.println("||=====Canteen MENU===||");
		 System.out.println("||=====1. View MENU===||");
		 System.out.println("||=====2.Order Items===||");
		 System.out.println("||====3. View bill===||");
		 System.out.println("||=====Canteen MENU===||");
		 System.out.println("||=====Canteen MENU===||");
		 System.out.println("||=====4.checkOut And Exit===||");
		 System.out.println("Enter Your Choice");
		 choice=scanner.nextInt();
		 switch(choice) {
		 case 1:
			 System.out.println("||===== MENU===||");
			 System.out.println("1.Tea- $"+teaprice);
			 System.out.println("2. coffe- $"+coffeprice);
			 System.out.println("3.samosa- $"+samosaprice);
		break;
		 case 2:
			 System.out.println("enter item number to order (-3)");
			 int item=scanner.nextInt();
			System.out.println("Enter Quantity");
			 int qty=scanner.nextInt();
			 if(qty<=0) {
				 System.out.println("Qunatity must be Greater Than 0");
				 break;
			 }
		 switch(item) {
		 case 1:
			 teaQty+=qty;
			 System.out.println(qty+"Tea(s)Added");
			 break;
		 
		 case 2:
			 coffeQty+=qty;
			 System.out.println(qty+"coffe(s)Added");
			 break;
		 case 3:
			 samosaQty+=qty;
		 
			 samosaQty+=qty;
			 System.out.println(qty+"samosa(s)Added");
			  break;
		      default:
		    	   System.out.println("Invaild Item Number."+"Please choose between 1-3");
		    	   break;
		 }
		 
		 break;
		 case 3:
			 int teaTotal=teaQty*teaprice;
			 int coffeTotal=coffeQty*coffeprice;
			 int samosaTotal=samosaQty*samosaprice;
			 int subTotal=teaTotal+coffeTotal+samosaTotal;
			 double tax=taxRate*subTotal;
			 double grandTotal=subTotal+tax;
			 
			 System.out.println("===Bill===");
			 if(teaQty>0) {
		     System.out.println("Tea x:"+teaQty+"=$"+teaTotal);
	 }
			if (coffeQty>0) {
				System.out.println("coffe x:"+coffeQty+"=$"+coffeTotal);	
			}
	       if (samosaQty>0) {
				System.out.println("samosa x:"+samosaQty+"=$"+samosaTotal);
	}
	       if (subTotal==0) {
				System.out.println("No Items Ordered Yet");
}else {
	System.out.println("Sub Total :" + subTotal);
	System.out.println("Tax(5%"+ tax);
	System.out.println("Total="+grandTotal);
}
	 break;
	 }
	 }
		 
			while (choice!=4);
			
	 }
	}

	
	
	

