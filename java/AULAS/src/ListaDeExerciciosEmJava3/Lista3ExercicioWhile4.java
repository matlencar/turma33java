package ListaDeExerciciosEmJava3;

import java.util.Scanner;

public class Lista3ExercicioWhile4 {

	public static void main(String[] args) {
		

	Scanner leia = new Scanner(System.in);
	int pessoas=4;
	int idade=0;
	char sexo;
	char escolha;
	int pessoasCalmas=0,mulheresNervosas=0,homensAgressivos=0,outrosCalmos=0;
	int pessoasNervosasComMais40Anos=0,pessoasCalmasComMenos18=0;
	int contador=0;
	
	while(contador < pessoas) {
		contador++;
		
		System.out.print("Digite sua idade aqui ");
		idade = leia.nextInt();
		
		System.out.print("Qual seu sexo(1-feminino / 2-masculino / 3-outro ");
		sexo = leia.next().charAt(0);
		
		System.out.print("Digite aqui se você é um(a): 1-pessoa calma\n2-pessoa nervosa\n3-pessoa agressiva ");
		escolha = leia.next().charAt(0);
		
		if(escolha=='1') {
			pessoasCalmas++;
		}
		if(sexo=='1' && escolha=='2') {
			mulheresNervosas++;
		}
		if(sexo=='2' && escolha=='3') {
			homensAgressivos++;
		}
		if(sexo=='3' && escolha=='1') {
			outrosCalmos++;
		}
		if(escolha=='2' && idade>40) {
			pessoasNervosasComMais40Anos++;
		}
		if(escolha=='1' && idade<18) {
			pessoasCalmasComMenos18++;
		}
		
	}
	System.out.println("Quantidade de pessoas entrevistadas na pesquisa: "+contador);
	System.out.println("Quantidade de pessoas calmas segundo as pesquisas: "+pessoasCalmas);
	System.out.println("Quantidade de mulheres nervosas segundo a pesquisa: "+mulheresNervosas);
	System.out.println("Quantidade de homens agressivos segundo a pesquisa: "+homensAgressivos);
	System.out.println("Quantidade de pessoas calmas conforme a pesquisa: "+outrosCalmos);
	System.out.println("Quantidade de pessoas nervosas com mais de 40 anos segundo as pesquisas: "+pessoasNervosasComMais40Anos);
	System.out.println("Quantidade de pessoas calmas com menos de 18 anos seundo as pesquisas: "+pessoasCalmasComMenos18);
}
}
