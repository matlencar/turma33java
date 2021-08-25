programa {

	inclua biblioteca Matematica --> Mat
	funcao inicio() {

		//Entrada - variaveis

		
		real multa, pesoTomate, excessoTomate, kilo, multaTotal
		
		multa = 4.0
		excessoTomate = 0.0
		kilo = 10.0
		

		escreva("Kg de tomate que foi comprado: ")
		leia(pesoTomate)

		escreva("excesso de tomate comprado: ")
		leia(excessoTomate)


		se (pesoTomate > kilo ) {
			excessoTomate = pesoTomate - kilo
			multaTotal = multa * excessoTomate
			escreva("O kilo excedido de tomate é de: ",excessoTomate, " então joão pagara de multa: ",multa)
		
		}

		senao {
			escreva("Se o kilo do tomate for ",excessoTomate, " ,então joão não pagara multa")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 433; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */