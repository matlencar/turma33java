package Classes;

public class NotaFiscal {
	//atributos
	private double valorCompra;
	private double totalValor;
	private char escolhaFormaDePagamento;
	private int quantidadeProduto;
	private String cliente;
	private String cpf;
	
	public NotaFiscal(double valorCompra, double totalValor, char escolhaFormaDePagamento, int quantidadeProduto,
			String cliente, String cpf) {
		super();
		this.valorCompra = valorCompra;
		this.totalValor = totalValor;
		this.escolhaFormaDePagamento = escolhaFormaDePagamento;
		this.quantidadeProduto = quantidadeProduto;
		this.cliente = cliente;
		this.cpf = cpf;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public double getTotalValor() {
		return totalValor;
	}

	public void setTotalValor(double totalValor) {
		this.totalValor = totalValor;
	}

	public char getEscolhaFormaDePagamento() {
		return escolhaFormaDePagamento;
	}

	public void setEscolhaFormaDePagamento(char escolhaFormaDePagamento) {
		this.escolhaFormaDePagamento = escolhaFormaDePagamento;
	}

	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	//metodos
	
	
	
}
