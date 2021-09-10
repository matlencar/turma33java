package classes;

public class Eletronicos {
	public String nome;
	public String cor;
	public double preco;
	public String tipoDeEletronico;
	public boolean funcionamento=true;
	
	public void testeAparelho() {
		System.out.println("Realizando o teste no aparelho ");
	}
	public void ligado() {
		System.out.println("O aparelho está ligado e funcionando perfeitamente ");
		
	}
	public void desligado() {
		System.out.println("Desligando o aparelho apos teste");
	}
}
