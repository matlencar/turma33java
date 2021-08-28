programa 

{
	funcao inicio()
	{
		inteiro Matriz3[3][3], total=0,diagonal=0
		para (inteiro x=0;x<3;x++) {
			para (inteiro y=0;y<3;y++) {
				escreva("Insira o valor da matriz na linha ",x," e na coluna ",y," ")
				leia(Matriz3[x][y])
				total=total+Matriz3[x][y]
				se(x==y) {
					diagonal=diagonal+Matriz3[x][y]
				}
			}
		}
		escreva("\n O total foi de ",total)
		escreva("\n Os valores encontrados na diagonal da matriz foram de: ",diagonal)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 432; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */