import java.util.Scanner;

public class Lista1Exercicio7 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double a,b,c,d,e,f,x,y;
		
		System.out.println("Leia o valor de A ");
		a = leia.nextDouble();
		System.out.println("Leia o valor de B ");
		b = leia.nextDouble();
		System.out.println("Leia o valor de C ");
		c = leia.nextDouble();
		System.out.println("Leia o valor de D ");
		d = leia.nextDouble();
		System.out.println("Leia o valor de E ");
		e = leia.nextDouble();
		System.out.println("Leia o valor de F ");
		f = leia.nextDouble();
		
		x = ((c*e)-(b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));
		
		System.out.println("O valor de x= "+x+" e o de y= "+y);
		System.out.println("\n%s O valor de x=%.2f e o de y=%.3f "+x+y);
		
		
				
				
	
		
		
		
	}

}
