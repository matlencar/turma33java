programa {
	funcao inicio() {
		
		inteiro horas
		inteiro minutos
		inteiro segundos

		escreva(" aqui qual o tempo da festa da fabrica em segundos ?:")
		leia(segundos)
		horas = segundos/3600
		minutos =(segundos%3600)/60
		segundos =((segundos%3600)%60)

		escreva("A festa da fabrica durou :"+horas+"horas "+minutos+" minutos e "+segundos+"segundos")
		
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 334; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */