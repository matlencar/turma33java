package aplicações;

import classes.ClienteNovo;

public class ClienteNovoExercicio {

	public static void main(String[] args) {
		ClienteNovo cliente = new ClienteNovo(true, null, 0, null, 0);
		
		
		System.out.println("Digite o seu nome: ");
		cliente.getNome();
		System.out.println("Digite sua idade : ");
		cliente.getIdade();
		System.out.println("Digite seu cpf : ");
		cliente.getCpf();
		System.out.println("Digite aqui seu ano de nascimento : ");
		cliente.getAnoNascimento();
		
		
	}
}