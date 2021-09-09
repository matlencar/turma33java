package classes;

public class Cliente {
	
	public String nome;
	public String cpf;
	public int anoNascimento;
	public boolean ativo;
	public char pronome;
	public boolean negativado;
	
	public Cliente(String cpf) {
		this.cpf = cpf;
		this.nome=nome;
	}
	public int calculeIdade() {
		
		return (2021-this.anoNascimento);
	}
	
	public int calculeIdade(int anoAtual) {
		
		return(anoAtual-this.anoNascimento);
	}
	public void ativarCliente() {
		ativo=true;
	}
	public void desativarCliente() {
		ativo=false;
	}
	public String tratamento(char codigo) {
		String resposta="";
		if(codigo=='1') {
			resposta ="Senhor";
		}
		else if(codigo=='2') {
			resposta="Senhora";
		}
		else if(codigo=='3') {
			resposta="senhore";
		}
		else {
			resposta="senhorx";
		}
		return resposta;
	}
	
}


