package com.ingeniousafrica.java;


import java.util.Scanner;

public class Logique {

	
	
	  public void Calcul(){
	    //Ce mot clé appelle le constructeur de la classe mère.  
	 
			    
			    String phrase;
			    phrase = "Le resultat de ";
			    
	    
	  			
				Scanner s= new Scanner(System.in); 


				
				System.out.println("Entrez un nombre: ");
				float n=s.nextInt();
				s.nextLine();
				
				
				System.out.println("Entrez  l'operateur: ");
				String c=s.nextLine();
				System.out.println(c);
				

				System.out.println("Entrez un second nombre: ");

/*<<<<<<< HEAD*/
				
/*=======
				System.out.println("Entrez un second nombre: "); */
/*>>>>>>> branch1*/

				float m=s.nextInt();
				s.nextLine();
				
				if (c.equals("+"))
				System.out.println(phrase +n+ "+" +m+"= "+(n+m));
				
				else if (c.equals("-"))
				System.out.println(phrase +n+"-"+m+"= " +(n-m));
				
				else if (c.equals("*"))	
				System.out.println(phrase +n+ "*" +m+ "= " +(n*m));
				
				else if (c.equals("/"))
				
					// Verification de la division par zero et des entiers
					 if (m == 0 || m < 0) 
					 {
						 System.out.println("Le diviseur n'est pas correct ");
					 }
					 else
					 {
						
						
						System.out.println(phrase +n+" /" +m+ "= " +(n/m));
					}
				else System.out.println ("Erreur ! Merci de verifier vos entrees"); 
			}


				
	  
	  }

