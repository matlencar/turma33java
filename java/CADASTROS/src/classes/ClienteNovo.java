package classes;

public class ClienteNovo {
			
			//atributos
			private boolean ativo = true;
			private String nome;
			private int idade;
			private String cpf;
			private int anoNascimento;
			
			
				//construtor
				public ClienteNovo(boolean negativado, String nome, int idade, String cpf, int anoNascimento) {
				super();
				this.ativo = negativado;
				this.nome = nome;
				this.idade = idade;
				this.cpf = cpf;
				this.anoNascimento = anoNascimento;
				}

				//encapsulamento
				public boolean isativo() {
					return ativo;
				}


				public void setNegativado(boolean negativado) {
					this.ativo = ativo;
				}


				public String getNome() {
					return nome;
				}


				public void setNome(String nome) {
					this.nome = nome;
				}


				public int getIdade() {
					return idade;
				}


				public void setIdade(int idade) {
					this.idade = idade;
				}


				public String getCpf() {
					return cpf;
				}


				public void setCpf(String cpf) {
					this.cpf = cpf;
				}


				public int getAnoNascimento() {
					return anoNascimento;
				}


				public void setAnoNascimento(int anoNascimento) {
					this.anoNascimento = anoNascimento;
				}
				
				//metodos
				 
				@Override
				public String toString() {
					return "ClienteNovo [negativado=" + ativo + ", nome=" + nome + ", idade=" + idade + ", cpf="
							+ cpf + ", anoNascimento=" + anoNascimento + "]";
				}
	}