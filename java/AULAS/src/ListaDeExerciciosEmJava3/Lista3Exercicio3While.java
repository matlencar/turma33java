package ListaDeExerciciosEmJava3;

import java.util.Scanner;

public class Lista3Exercicio3While {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade,pessoasCom21=0,pessoasCom50=0;
		
		System.out.println("Qual é a sua idade: ");
		idade = leia.nextInt();
		
		while(idade !=-99) {
			System.out.println("digite o numero de pessoas com menos de 21 anos e mais de 50 a ser somado: ");
			idade = leia.nextInt();
			
			if(idade<=21) {
				pessoasCom21++;
			}
			else if(idade>=50) {
				pessoasCom50++;
			}
		}
		System.out.println("Pessoas com idade igual ou menor a 21 é de: "+pessoasCom21+" e os que tem igual ou mais que 50 são de: "+pessoasCom50);
	}
}