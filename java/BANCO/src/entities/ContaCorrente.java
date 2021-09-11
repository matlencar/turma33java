package entities;

public class ContaCorrente extends Conta {
	
	//atributos
	private int contadorTalao;
	
	public ContaCorrente(int numero, String cpf, int contadorTalao) {
		super(numero, cpf);
		this.contadorTalao = contadorTalao;
	}
	//encapsulamento

	public int getContadorTalao() {
		return contadorTalao;
	}

	public void setContadorTalao(int contadorTalao) {
		this.contadorTalao = contadorTalao;
	}
	
	
	//metodos
	public void Talao(int quantidadeTalao) {
		 {
			 if(quantidadeTalao <= 3) {
                if(contadorTalao <= quantidadeTalao);
                 this.debito(30);
                 contadorTalao++;
             }
				
			}
		}
		
	}	
