import java.util.Scanner;

public class Lista1Exercicio3 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		int horas;
		int minutos;
		int segundos;
		
		System.out.println("Qual o tempo de duração da festa a fantasia ?");
		segundos = leia.nextInt();
		
		horas = segundos/3600;
		minutos = (segundos % 3600)/60;
		segundos = ((segundos%3600)%60);
		
		System.out.println("A festa a fantasia durou: "+horas+" horas"+" minutos e "+"segundos"+segundos);
	}
}
