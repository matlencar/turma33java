programa {
	
	inclua biblioteca Matematica -->mat
	funcao inicio() {

		real n1,n2,n3,n4,qn3

		escreva("Calculando n1 \n")
		leia(n1)

		escreva("Calculando n2 \n")
		leia(n2)

		escreva("Calculando n3 \n")
		leia(n3)

		escreva("Calculando n4 \n")
		leia(n4)


		qn3 = mat.potencia(n3, 2.0)

		se (qn3 >= 1000) {
			escreva("O resultado de qm3 é: " ,qn3, " sendo assim pode finalizar aqui mesmo")
		}

		senao {
			escreva("n1 é: ",n1,"seu valor quadrado é de ",mat.potencia(n1, 2),"\n")
			escreva("n2 é: ",n2,"seu valor quadrado é de ",mat.potencia(n2, 2),"\n")
			escreva("n3 é: ",n3,"seu valor quadrado é de ",mat.potencia(n3, 2),"\n")
			escreva("n4 é: ",n4,"seu valor quadrado é de ",mat.potencia(n4, 2),"\n")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 69; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */