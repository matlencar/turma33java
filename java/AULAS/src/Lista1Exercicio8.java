import java.util.Scanner;

public class Lista1Exercicio8 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double percentualDistribuidor=29,percentualImposto=47;
		int custoFabrica,valorDistribuidor,valorImposto,custoConsumidor = 0;
		
		System.out.println("Informe o valor de custo de fabrica: ");
		custoFabrica = leia.nextInt();
		
		valorDistribuidor =(int) (custoFabrica + (custoFabrica *percentualDistribuidor)/100);
		
		valorImposto = (int) (custoFabrica +(custoFabrica * percentualDistribuidor )/100);
		
		custoConsumidor = custoConsumidor + valorDistribuidor + valorImposto; 
		
		System.out.println("O custo final ao consumidor é de: "+custoConsumidor);
	}

}


