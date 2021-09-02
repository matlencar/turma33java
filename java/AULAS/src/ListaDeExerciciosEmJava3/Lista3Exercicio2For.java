package ListaDeExerciciosEmJava3;

import java.util.Scanner;

public class Lista3Exercicio2For {

	public static void main(String[] args) {
		// Ler 10 números e imprimir quantos são pares e quantos são ímpares.
		Scanner leia = new Scanner(System.in);
		int numero,impar=0,x=0,par=0;
		
		for (x=1;x<=10;x++) {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			if (numero%2==0) {
				par++;
			}
			if(numero%2==1) {
				impar++;
			}
		}
		
		System.out.println("A quantia de numeros pares são de: "+par+" e a de impares são: "+impar);
		
	}

}
