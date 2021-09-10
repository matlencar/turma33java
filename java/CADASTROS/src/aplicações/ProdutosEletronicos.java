package aplicações;

import classes.Eletronicos;

public class ProdutosEletronicos {

	public static void main(String[] args) {
		Eletronicos produtos = new Eletronicos();
		
		produtos.cor="azul";
		produtos.nome="Notebook";
		produtos.preco=2000.00;
		produtos.tipoDeEletronico="Portatil";
		
		
		System.out.printf("O produto %s custa %.2f ",produtos.nome,produtos.preco);
		System.out.println("\n");
		produtos.ligado();
		
		

	}

}
