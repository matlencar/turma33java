import java.util.Scanner;

public class Lista1Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String nome;
		int anos;
		int mesesVividos = 0;
		int diasVividos =0;
		
		
		System.out.println("Quantos anos você tem? ");
		anos = leia.nextInt();
		
		System.out.println("Meu amigo você possui: "+anos+" e quantos meses ? ");
		mesesVividos = leia.nextInt();
		
		System.out.println("Amigo você possui "+anos+" anos e "+mesesVividos+" meses e quantos dias? ");
		diasVividos = leia.nextInt();
		
		diasVividos=((anos*365)+(mesesVividos*30)+diasVividos);
		
		System.out.println("Então meu amigo você possui aproximadamente "+ diasVividos +" dias de idade!");
	}
	
}
