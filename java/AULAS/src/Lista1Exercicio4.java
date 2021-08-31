import java.util.Scanner;

public class Lista1Exercicio4 {

	public static void main(String[] args) {
	
		Scanner potencia = new Scanner(System.in);
		
		double r,s,d;
		int a;
		int b;
		int c;
		
		System.out.println("Qual é o valor de A : ");
		a = potencia.nextInt();
		
		System.out.println("Qual é o valor de B : ");
		b = potencia.nextInt();
		
		System.out.println("Qual é o valor de C : ");
		c = potencia.nextInt();
		
		r = Math.pow(a+b, 2);
		s = Math.pow(b+c, 2);
		d = r+s/2;
		
		System.out.println("O resultado da expressão matematica é "+d);
		
		/*System.out.println(Math.pow(a+b, 2));
		r = potencia.nextDouble();
		System.out.println(Math.pow(b+c, 2));
		s = potencia.nextDouble();
		d = r+s/2;
		*/ 
		
	}
}
