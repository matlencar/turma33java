package Lista4ExercicioVetoresEMatriz;

import java.util.Random;

public class AleatoriosAtividadeVetorMatriz {

	public static void main(String[] args) {
		
		Random aleatorio = new Random();
		String lugar  [] = {"vaticano","quadra mangueira","templo de salom�o","ilhas maldivas","praia grande"};
		int numero;
		
		numero = aleatorio.nextInt((lugar.length)-1);
		System.out.println("voc� est� agora "+lugar[numero]);

	}

}
