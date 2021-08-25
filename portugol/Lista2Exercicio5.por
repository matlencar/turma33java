programa
{
	
	funcao inicio()
	{
	
		real nivelPoluicao

		escreva("O quanto as empresas estão poluidas ? ")
		leia(nivelPoluicao)

		escreva("Não há alerta de poluição, sigam com suas rotinas")

		se(nivelPoluicao >=0.3 e nivelPoluicao <0.4) {
			escreva("1º grupo devem parar suas atividades")
		}

		senao se (nivelPoluicao >=0.4 e nivelPoluicao <0.5) {
			escreva("1º e 2º grupo devem parar suas atividades")
		}

		senao se (nivelPoluicao > 0.5) {
			escreva("Todas as empresas devem parar suas atividades")
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 197; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */