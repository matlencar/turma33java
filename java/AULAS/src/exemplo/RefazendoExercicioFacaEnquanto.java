package exemplo;

public class RefazendoExercicioFacaEnquanto {

	public static void main(String[] args) {
		// do {  } while ();
		
		int numero =233;
		
			do {
				if (numero >=300 && numero <=500) {
				numero = numero + 5;
				}
				else {
				numero =numero + 3;
				}
				System.out.println(numero);
				}
			
			while(numero <456);
	}
}


