import java.text.DecimalFormat;
import java.util.Scanner;

public class CelsiusParaFahrenheit {
	
	public static void main(String[] args) {
		double celsius, Fahrenheit;
		Scanner leia = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		
		System.out.println("Convertendo a temperatura ");
		System.out.println("Digite aqui a temperatura em Fahrenheit: ");
		Fahrenheit = leia.nextDouble();
		
		celsius = (5 *(Fahrenheit - 32))/9;
		
		System.out.println("Temperatura em celsius: "+ formatador.format(celsius)+" °C");
		
		
		
	}

}
