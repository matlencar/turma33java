programa
 {
	funcao inicio() {

		real base
		real altura
		real area
		
		escreva("digite aqui qual é a base? ")
		leia(base)

		escreva("digite qual é a altua ? ")
		leia(altura)


		se (base < 0 ou altura < 0) {
			
			escreva("coloque valores que sejam validos ")
		}

		senao  {
			area = (base * altura) / 2

			escreva("O valor da encontrada na base triangulo é de: ",base) 
			escreva("valor encontrado na sua altura do triangulo é de: ",base,"\n")
			escreva("A area do triangulo é de: ",area)
			
		}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 368; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */