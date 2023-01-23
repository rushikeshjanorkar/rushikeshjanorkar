package MyProgram;

import java.util.Scanner;

public class Store_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter The Your Item List:-"+
		           "\n1.Rice"+
		           "\n2.Tea"+
		           "\n3.Sugar"+
		           "\n4.Salt"+
		           "\n5.Turmeric Powder"+
		           "\n6.Wheat"+
		           "\n7.Poha"+
		           "\n8.Maida"+
		           "\n9.Rava"+
		           "\n10.Red chilli"+
		           "\n11.exit and calculate"+
		           "\n"+
		           "\nWelcome To My Mart Store");

		int rice = 0, sugar=0,tea = 0 , salt =0 , powder =0, wheat =0, poha=0, maida=0, rava=0, chilli=0 ;
		for (int i=0 ; i<=11 ; i++) {
			
		Scanner scan = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("Enter the Item");
		int Item=scan.nextInt(); 
		System.out.println("Enter the Quty");
		int Quty=scan.nextInt();
		
		
		
	    String ItemString="yu";
	    switch(Item){  
	    case 1: 
	   
	    System.out.println( ItemString="1 - Rice ="+Quty*35);
	    rice = Quty*35;
	    break;
	    
	    case 2: 
	    	System.out.println( ItemString="2  - Tea ="+Quty*135);
	    tea = Quty*135;
	    break; 
	    
	    case 3: 
	     System.out.println( ItemString="3 - Sugar ="+Quty*45);
	     sugar = Quty*45;
	    break;
	    
	    case 4:
	    	System.out.println( ItemString="4 - Salt ="+Quty*28);
		    salt = Quty*28;
	    break; 
	    
	    case 5: 
	    	System.out.println( ItemString="5 - Turmeric Powder ="+Quty*250);
		     powder = Quty*250;
	    break;
	    
	    case 6:
	    	System.out.println( ItemString="6 - Wheat ="+Quty*42);
		     wheat = Quty*42;
	    break; 
	    
	    case 7: 
	    	System.out.println( ItemString="7 - Poha ="+Quty*38);
		     poha = Quty*38;
	    break; 
	    
	    case 8:
	    	System.out.println( ItemString="8 - Maida ="+Quty*37);
		     maida = Quty*37;
	    break; 
	    
	    case 9:
	    	System.out.println( ItemString="9 - Rava ="+Quty*48);
		     rava = Quty*48;
	    break; 
	    
	    case 10:
	    	System.out.println( ItemString="10 - Red Chilli ="+Quty*350);
		     chilli = Quty*350;
	    break;  
	    
	   
	    default: 
	    	
	    int sum = rice+tea+sugar+salt+powder+wheat+poha+maida+rava+chilli;
	    System.out.println("Thank you for shopping");
	    System.out.println("Total Of Your Item ="+sum);
    	System.exit(0);
	    }  
	    
	    
	} 
		
	}}
