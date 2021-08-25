programa
{
	
	funcao inicio()
	{
		real somatoriaResultado=0.0, media, total=0.0, nN=0.0

		enquanto (nN>=0) {
			escreva("digite o numero a ser somado uns com os outros: ")
			leia(nN)
			se (nN >=0) {
				somatoriaResultado = somatoriaResultado + nN
				total = total+1
			}
		}
		escreva("A respectiva somatoria dos numeros entre eles é: ",somatoriaResultado,"\n")
		media = somatoriaResultado/total

		escreva("A media dos valores é de: ",media,"\n")
		escreva("O total de numeros que foram digitados ",total)
		
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 517; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */