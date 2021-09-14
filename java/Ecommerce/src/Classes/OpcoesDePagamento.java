package Classes;

import java.util.Scanner;

public class OpcoesDePagamento {
	//atributos
	Scanner leia = new Scanner(System.in);
	private char opcoesPagamento;
	private int debito;
	private int credito;
	private int duasVezes;
	
	//construtor
	public OpcoesDePagamento(char opcoesPagamento, int debito, int credito, int duasVezes) {
		super();
		this.opcoesPagamento = opcoesPagamento;
		this.debito = debito;
		this.credito = credito;
		this.duasVezes = duasVezes;
	}
	//encapsulamento
	public char getOpcoesPagamento() {
		return opcoesPagamento;
	}

	public void setOpcoesPagamento(char opcoesPagamento) {
		this.opcoesPagamento = opcoesPagamento;
	}

	public int getDebito() {
		return debito;
	}

	public void setDebito(int debito) {
		this.debito = debito;
	}

	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}

	public int getDuasVezes() {
		return duasVezes;
	}

	public void setDuasVezes(int duasVezes) {
		this.duasVezes = duasVezes;
	}
	//metodos
	public void pagamento(char opcoesPagamento) {
		if(debito == '1') {
			(this.getDebito() * 0.9);
		}
		else if(credito == '2') {
			(this.getCredito() * 1.1)
		}
		else if(duasVezes =='3') {
			(this.getDuasVezes() * 1.15)
		}
		else {
			System.out.println("Você digitou a opção errada, tente de novo");
		}
	}
	
	
}
