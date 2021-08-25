programa
{
	
	funcao inicio()
	{
		const real totalHabitantes = 5.0
		inteiro filhos, totalDeFilhos=0
		real salarioMenor=0.0, salario, totalSalario = 0.0, mediaSalario=0.0, maiorSalario=0.0, percentualSalario, mediaFilhos=0.0

		para (inteiro x=1; x<=totalHabitantes; x++) {
			escreva("digite o seu salario aqui: ",x," \n")
			leia(salario)

			escreva("Digite a quantidade de filhos que você possui: ",x," \n")
			leia(filhos)
			totalDeFilhos = totalDeFilhos + filhos

			se (salario > maiorSalario) {
				maiorSalario = salario
			}
			
			totalSalario = totalSalario + salario
			se (salario <=100) {
				salarioMenor = salarioMenor+1
			}
		}
		mediaSalario = totalSalario/totalHabitantes
		escreva("\n A media de salario é: ",mediaSalario)
		
		mediaFilhos = totalDeFilhos/totalHabitantes
		escreva("\n A media de filhos da população são de: ",mediaFilhos)

		escreva("\n O maior salario é ",maiorSalario)
		percentualSalario = (salarioMenor/totalHabitantes) * 100
		escreva("\n Os habitantes com o salario menor que 100,00:: ",percentualSalario," %")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 381; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */