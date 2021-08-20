programa {
	
	inclua biblioteca Matematica
	funcao inicio() {

	real R,S,D
	inteiro a,b,c

	escreva("Qual seria o valor A: ")
	leia(a)

	escreva("Qual seria o valor e B: ")
	leia(b)
	escreva("Qual seria o valor  C: ")
	leia(c)

	R = Matematica.potencia(a+b, 2)
	S = Matematica.potencia(b+c, 2)
	D =R+S/2

	escreva("O resultado é: ")

	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 304; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */