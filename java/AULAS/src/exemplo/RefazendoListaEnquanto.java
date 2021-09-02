package exemplo;

import java.util.Scanner;

public class RefazendoListaEnquanto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double somatoriaResultado=0.0, media=0.0, total=0.0, nN=0.0;
		
		System.out.println("\"digite o numero a ser somado uns com os outros: ");
		nN = leia.nextDouble();
		
		while (nN>=0) {
			System.out.println("digite o numero a ser somado uns com os outros: ");
			nN = leia.nextDouble();
			if(nN >=0) {
				somatoriaResultado = somatoriaResultado + nN;
				total = total+1;
		}
	}
	
		System.out.println("A respectiva somatoria dos numeros entre eles é: "+somatoriaResultado+"\n ");
		
		media = somatoriaResultado/total;
		
		System.out.println("A media dos valores é de: "+media+"\n");
		System.out.println("O total de numeros que foram digitados "+total);
	}
}