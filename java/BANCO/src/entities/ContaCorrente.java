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
	
	//Solicitar ao final dos 10 movimentos ou ao pedido de sair se o mesmo deseja solicitar cheque, 
	//limitando em apenas 3 cheques. cada talão debita a conta em R$ 30.00.
	
	//metodos
	public void Talao(double pedidoTalao) {
		 {
			if(pedidoTalao <= 3 ) {
				pedidoTalao = pedidoTalao * 30;
				
			}
		}
		
	}
	
}
