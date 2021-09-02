package ListaDeExerciciosEmJava3;

import java.util.Scanner;

public class Lista3Exercicio4While {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero=0,soma=0;
		
		do {
			System.out.print("Digite um numero inteiro: ");
			numero = leia.nextInt();
				soma+=numero;
			
		}while(numero!=0);
		
		System.out.println("O resultado das somas é de: "+soma);
	}

}
