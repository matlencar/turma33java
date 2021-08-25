programa
{
	
	funcao inicio()
	{
		inteiro somaNumerica
		inteiro contador = 0
		inteiro totalASerSomado = 0

		escreva("digite um numero positivo: ")
		leia(somaNumerica)
		
		faca {
			escreva(contador)
			escreva(" + ")
			totalASerSomado = totalASerSomado + contador
			contador = contador + 1
			
		}enquanto (contador <=somaNumerica)

		escreva(" = ",totalASerSomado)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 343; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */