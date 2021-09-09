package exemplo;

import java.util.Scanner;

public class ExercicioTrinagulo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in)
;		double a,b,c,d,e,f;
		
		System.out.println("Escreva qual a altura do triangulo ");
		a = leia.nextDouble();
		System.out.println("Escreva qual a base do triangulo ");
		b = leia.nextDouble();
		
		c=(a*b)/2;
		
		System.out.println(" A area do triangulo é de "+c);
		
		System.out.println("Escreva qual a altura do triangulo ");
		d = leia.nextDouble();
		System.out.println("Escreva qual a base do triangulo ");
		e = leia.nextDouble();
		
		f=(d*e)/2;
		
		if(c>f) {
			System.out.println("A area do maior triangulo é de "+c);
		}
		else {
			System.out.println("O area do maior triangulo é de: " + f);
		}

	}

}
