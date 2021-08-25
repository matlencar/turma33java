programa
{	
	funcao inicio()
	{
	
		inteiro idade
	
		escreva("Qual a idade o nadador(a) ? ")
		leia(idade)
	
		se (idade >= 5 e idade <= 7)
		{
			escreva("Classificação do nadador(a) é infantil A ")
		}
		senao se (idade >= 8 e idade <= 11)
		{
			escreva("Classificação do nadador(a) é infantil B ")
		}
		senao se (idade >= 12 e idade <= 13)
		{
			escreva("Classificação do nadador(a) é Juvenil A")
		}
		senao se (idade >= 14 e idade <= 17)
		{
			escreva("Classificação do nadador(a) é Juvenil B ")
		}	
		senao se (idade >= 18)
		{
			escreva("Classificação do nadador(a) é adulto ")
		}	
		senao
		{
			escreva("Você ainda não possui idade o suficiente para nadar, tente no ano que vem !!! ")
		}		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 686; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */