package com.ingeniousafrica.java;

import java.util.Scanner;




public class Main {
	
	public static char rep = ' ';
	public static Scanner s = new Scanner(System.in);
	
public static void main(String[] argv )



{
	Logique log = new Logique();
	
	/*for(int i = 1; i <= 10; i++)
	{
		log.Calcul();
			
	}
	//*/
	
	do
	{
		log.Calcul();
		 
        
        	 System.out.println("\nVoulez-vous réessayer ? (O/N)");
             rep = s.nextLine().charAt(0);
     	
     	//*}while (rep != 'O' && rep != 'N');*/
    
}while (rep == 'O');

System.out.println("Au revoir...");
	}
}


