programa
{
	
	funcao inicio()
	{
		const inteiro tamanho = 3
		inteiro mat[tamanho][2],linha,coluna

		para (linha=0;linha<tamanho;linha++) 
		{
			para (coluna=0;coluna<2;coluna++) 
			{
				escreva(" Valor: ")
				leia(mat[linha][coluna])
			}
		}
		limpa()
		para (linha=0;linha<tamanho;linha++)
		{
			para (coluna=0;coluna<2;coluna++)
			{
				escreva("[ ",mat[linha][coluna]," ]")
			}
				4escreva("\n")
		}
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