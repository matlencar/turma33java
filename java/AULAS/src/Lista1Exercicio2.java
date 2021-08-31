import java.util.Scanner;

public class Lista1Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String nome;
		int anos;
		int diasVividos=0;
		int mesesVividos=0;
		int idadePessoaEmDias;
		
		System.out.println("Informe a idade da pessoa em dias: ");
		idadePessoaEmDias =leia.nextInt();
		
		anos = idadePessoaEmDias/365;
		mesesVividos = (idadePessoaEmDias % 365)/30;
		diasVividos = (idadePessoaEmDias % 365)/30;
		
		System.out.println("\nAnos: "+anos);
		System.out.println("\nMeses: "+mesesVividos);
		System.out.println("\nDias: "+diasVividos);
	}
	
}
