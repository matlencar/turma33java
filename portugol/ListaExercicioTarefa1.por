programa
{
	
	funcao inicio()
	{
		inteiro anos, meses, dias

		escreva("Quantos anos voce tem: ")
		leia (anos)
		
		escreva("Amigo você possui "+ anos +" anos e quantos meses?:")
		leia (meses)

		escreva("Amigo você possui "+ anos +" anos "+ meses +"meses e quantos dias?:")
		leia (dias)

		dias=((anos*365)+(meses*30)+dias)
		
		escreva ("Então meu amigo você possui aproximadamente "+ dias +" dias de idade!")
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 415; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */