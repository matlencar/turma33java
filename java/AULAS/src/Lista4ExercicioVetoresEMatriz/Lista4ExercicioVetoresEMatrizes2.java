package Lista4ExercicioVetoresEMatriz;

import java.util.Scanner;

public class Lista4ExercicioVetoresEMatrizes2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int Matriz3[][] = new int[3][3], total=0,diagonal=0;
				for (int x=0;x<3;x++) {
					for (int y=0;y<3;y++) {
						System.out.println("Insira o valor da matriz na linha "+x+" e na coluna "+y+" ");
						Matriz3[x][y] = leia.nextInt();
						total = total + Matriz3[x][y];
						if(x==y) {
							
							diagonal=diagonal+Matriz3[x][y];
						}
						System.out.println();
					}
				}
				System.out.println("\n O total foi de "+total);
				System.out.println("\n Os valores encontrados na diagonal da matriz foram de: "+diagonal);
	}

}
