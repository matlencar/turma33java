package exemplo;

import java.util.Scanner;

public class CalculandoTriangulo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double area,altura,base;
		double area2,altura2,base2;
		
		System.out.println("Digite o valor da base ");
		base = leia.nextDouble();
		System.out.println("Digite o valor da altura ");
		altura = leia.nextDouble();
		
		area = (base*altura)/2;
		
		System.out.printf("Area igual a %.2f",area);
		
		System.out.println("Digite o valor da base ");
		base2 = leia.nextDouble();
		System.out.println("Digite o valor da altura ");
		altura2 = leia.nextDouble();
		
		area2 = (base2*altura2)/2;
		
		System.out.printf("Area igual a %.2f",area);
		
		if(area==area2) {
			System.out.println("Triangulo com asreas iguais ");
		}
		else if (area > area2) {
			System.out.println("Triangulo 1 e maior");
		}
	}

}
