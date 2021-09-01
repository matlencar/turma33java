import java.util.Scanner;

public class OiMundo {

	public static void main(String[] args) {
		//teste
		//variaveis
		
		Scanner leia = new Scanner(System.in);//instanciamento
		String nome;
		int anoNascimento;
		int anoAtual=2021;
		
		//entradas
		
		System.out.print("Digite nome: ");
		nome = leia.next().toUpperCase();
		System.out.print("Digite o ano de nascimento :");
		anoNascimento = leia.nextInt();
		
		//saida
		System.out.println(nome.toUpperCase()+" sua idade é "+(anoAtual-anoNascimento+" anos"));
		System.out.println("O nome da pessoa digitada tem o total de letras: "+nome.length());
		
	}
	
}
