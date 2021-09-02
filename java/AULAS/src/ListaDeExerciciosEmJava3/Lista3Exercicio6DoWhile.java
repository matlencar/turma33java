package ListaDeExerciciosEmJava3;

import java.util.Scanner;

public class Lista3Exercicio6DoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero=0;
		int contador=0;
		double media=0.00;
		double total=0.00;
		
		do {
			System.out.print("Digite um numero: ");
			numero = leia.nextInt();
			if(numero>0 && (numero%3)==0)
			contador++;
			
		} while (numero > 0);
		if(contador>0)
		media = total/contador;
		System.out.printf("Total de numeros %.0f, e total de numeros digitados multiplos de 3 %d e media %.2f ",contador,total,media);
	}

}
