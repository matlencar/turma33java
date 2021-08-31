import java.util.Scanner;

public class Lista1Exercicio5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double primeiraNota, segundaNota, terceiraNota,mediaFinal;
				
		System.out.println("Insira aqui a primeira nota do aluno(a): ");
		primeiraNota = leia.nextDouble();
		
		System.out.println("Insira aqui a segunda nota do aluno(a): ");
		segundaNota = leia.nextDouble();
		
		System.out.println("Insira aqui a terceira nota do aluno(a): ");
		terceiraNota = leia.nextDouble();
		
		mediaFinal = ((primeiraNota * 2) + (segundaNota * 3) + (terceiraNota * 5))/10;
		
		System.out.println("A media final do aluno(a) foi de: "+mediaFinal);
		
	}
}
