package exemplo;

import java.util.Scanner;

public class Lista2Exercicioo4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double numero,r;
		
		System.out.println("Digite um numero: ");
		numero = leia.nextDouble();
		
		if (numero<0) {
			System.out.println("Numero negativo ");
		}
		
		else if(numero==0) {
			System.out.println("numero neutro ");
		}
		
		else if(numero %2==0) {
			System.out.println("Numero é par");
			System.out.println("O resultado enquanto par é de: "+Math.sqrt(numero));
		}
		
		else {
			System.out.println("Numero é impar");
			System.out.println("O resultado da raiz quando impar é de: "+Math.pow(numero, 2));
		}

	}

}
