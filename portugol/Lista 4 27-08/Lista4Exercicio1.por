programa
{
	
	funcao inicio()
	{
		inteiro pontos[5], maior=0
		escreva("Verifcando a maior nota ")
		para (inteiro x=0; x<5; x++) 
		{
			escreva("digite o valor ",x+1," da maior nota: \n")
			leia(pontos[x])
		}
		escreva("Sua nota é: \n")
		para (inteiro x=0; x<5; x++) 
		{
			escreva(" ",x,",")
		}
		
		
		para (inteiro x=0; x<5; x++)
		se(maior<pontos[x]){
			maior=pontos[x]	
		}
		escreva("\n A nota mais alta obtida foi: ",maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 425; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */