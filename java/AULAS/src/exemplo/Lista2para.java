package exemplo;

import java.util.Scanner;

public class Lista2para {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int soma=0;
		int somaDosImparesDe3=500;
		
		for(int x=1; x<=somaDosImparesDe3; x++) {
			if(x%2==1 && x%3 == 0) {
				System.out.println("\n"+x);
				
			}
		}
		System.out.println("\n"+soma);

	}

}
