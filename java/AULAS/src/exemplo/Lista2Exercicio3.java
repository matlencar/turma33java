package exemplo;

import java.util.Scanner;

public class Lista2Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.println("Qual é a sua idade: ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.println("Categoria infantil ");
		}
		else if(idade>15 && idade<=17) {
			System.out.println("Categoria juvenil ");
		}
		else if(idade >=18 && idade<=25) {
			System.out.println("Categoria adulto ");
		}
		else {
			System.out.println("Idade insuficiente!!! Obrigado pela compreensão");
		}
	}
}
