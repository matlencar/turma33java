package classes;

public class ClienteNovo {
	
			public boolean negativado = true;
			public String nome;
			public int idade;
			public String cpf;
			public int anoNascimento;
			
			
			
			public void novoCliente(){
				System.out.println(nome);
			}
			
			public void negativoCliente(){
				negativado = false;
			}
			
			public void lpositivoCliente(){
				negativado = true;
			}
			public int idadeCliente(int anoAtual) {
				return(anoAtual-anoNascimento);
			}
	}