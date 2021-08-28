programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		inteiro lancamento[10]
		real mediaDados = 0.00
		inteiro maiorVezesDados =0
		inteiro maiorLancamento = 0

		para (inteiro x=0; x<10;x++) {
			lancamento[x] = Util.sorteia(1, 6)
			mediaDados += lancamento[x]

			 se (lancamento[x] > maiorLancamento)
			 	maiorLancamento = lancamento[x]
		}

		escreva("O resultado obtido nos dados foram: \n")
		para (inteiro x=0;x<10;x++) {
			escreva("O lancamento ",(x+1)," resultou em: ",lancamento[x],"\n")

			se (lancamento[x] == maiorLancamento)
				maiorVezesDados = maiorVezesDados + 1
		}

		mediaDados/=10

		escreva("\n A media de resultados foi de: ",mediaDados)
		escreva("\n O maior resultado foi de: ",maiorLancamento)
		escreva("\n O maior resultado conseguiu se repetir em: ",maiorVezesDados," vezes \n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 809; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */