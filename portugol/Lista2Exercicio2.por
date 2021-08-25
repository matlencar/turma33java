programa {
	funcao inicio() {
		
		inteiro C
		real numeroHorasTrabalhadas, horaExtra, salario, salarioExcedido

		horaExtra = 0.0
		numeroHorasTrabalhadas = 0.0
		salario = 0.0
		salarioExcedido = 0.0

		escreva("Codigo de operario é: ")
		leia(C)

		escreva("numero de horas trabalhadas pelo operario é :")
		leia(numeroHorasTrabalhadas)

		se (numeroHorasTrabalhadas <= 50) {
			salario = numeroHorasTrabalhadas * 10
		}

		senao {
			horaExtra = numeroHorasTrabalhadas - 50
			salarioExcedido = horaExtra * 20
			salario = (50 * 10)+salarioExcedido
		}

		escreva("ola amigo, seu codigo de operario é: ",C,"\n")
		escreva("Então seu numero de horas trabalhaas é de: " ,numeroHorasTrabalhadas,"\n")
		escreva("Você acabou trabalhando um total de ",horaExtra," em horas extras \n")
		escreva("Com isso seu salario total é de ",salario,"\n")
		escreva("total salario escedido ",salarioExcedido)
		
	}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 895; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */