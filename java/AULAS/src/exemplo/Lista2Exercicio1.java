package exemplo;

import java.util.Scanner;

public class Lista2Exercicio1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numeroInteiro1,numeroInteiro2,numeroInteiro3;
		
		System.out.print("Digite aqui o primeiro numero inteiro: ");
		numeroInteiro1 = leia.nextInt();
		
		System.out.print("Digite aqui o segundo numero inteiro: ");
		numeroInteiro2 = leia.nextInt();
		
		System.out.print("Digite aqui o terceiro numero inteiro: ");
		numeroInteiro3 = leia.nextInt();
		
		if ((numeroInteiro1>=numeroInteiro2) && numeroInteiro1>=numeroInteiro3) {
			System.out.print("O primeiro numero inteiro � o maior "+numeroInteiro1);
		}
		else if ((numeroInteiro2>=numeroInteiro1) && numeroInteiro2>=numeroInteiro3) {
			System.out.print("O segundo numero inteiro � o maior "+numeroInteiro2);
		}
		else if ((numeroInteiro3>=numeroInteiro2) && numeroInteiro3>=numeroInteiro1) {
			System.out.print("O terceiro numero inteiro � o maior "+numeroInteiro3);
		}
		else {
			System.out.print("Se n�o digitar um numero ent�o fim de programa");
		}
	}
}
