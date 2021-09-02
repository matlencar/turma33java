package exemplo;

import java.util.Scanner;

public class Lista2Exercicio2 {
	
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			
			int n1,n2,n3;
			
			System.out.print("Digite aqui o primeiro numero inteiro: ");
			n1 = leia.nextInt();
			
			System.out.print("Digite aqui o segundo numero inteiro: ");
			n2 = leia.nextInt();
			
			System.out.print("Digite aqui o terceiro numero inteiro: ");
			n3 = leia.nextInt();
			
			if (n1 <= n2 && n2 <= n3)
		    	{
				System.out.printf("%d %d %d ", n1, n2, n3);
			    }
			  else if (n1 <= n3 && n3 <= n2)
			    {
				  System.out.printf("%d %d %d ", n1, n3, n2);
			    }
			  else if (n2 <= n1 && n1 <= n3)
			    {
				  System.out.printf("%d %d %d ", n2, n1, n3);
			    }
			  else if (n2 <= n3 && n3 <= n1) 
			    {
				  System.out.printf("%d %d %d ", n2, n3, n1);
			    }
			  else if (n3 <= n1 && n1 <= n2) 
			    {
				  System.out.printf("%d %d %d ", n3, n1, n2);
			    }
			  else 
			    {
				  System.out.printf("%d %d %d ", n3, n2, n1);
			    }
			}
		}