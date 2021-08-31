import java.util.Scanner;

public class Lista1Exercicio6 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double x1,x2,x3,x4, d;
	
		System.out.println("Digite o valor correspondente a X1");
		x1 = leia.nextDouble();
		
		System.out.println("Digite o valor correspondente a X2");
		x2 = leia.nextDouble();
		
		System.out.println("Digite o valor correspondente a X3");
		x3 = leia.nextDouble();
		
		System.out.println("Digite o valor correspondente a X4");
		x4 = leia.nextDouble();
		
		d = Math.pow((x2 -x1), 2) + Math.pow((x4 -x3), 2);
		
		System.out.println("O resultado de D é "+d);
		
	}
}
