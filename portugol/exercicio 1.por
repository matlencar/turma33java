programa {
	funcao inicio() {

		inteiro IdadePessoasEmDias
		inteiro dias
		inteiro anos
		inteiro meses

		escreva("informe a idade da pessoa em dias :")
		leia(IdadePessoasEmDias)

		anos = IdadePessoasEmDias / 365
		meses = (IdadePessoasEmDias % 365)/30
		dias = (IdadePessoasEmDias % 365)/30

		escreva("\n Anos: "+anos)
		escreva("\n Meses: "+meses)
		escreva("\n Dias: "+meses)
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 384; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */