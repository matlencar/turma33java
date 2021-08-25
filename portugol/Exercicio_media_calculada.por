programa
{
	
	funcao inicio()
	{
		cadeia nome
		caracter pronome
		real nota = 0.0,media, somaNotas=0.0
		const inteiro  quantidade=5
		const real media_escolar=5.00
		real maiorNota = 0.0
		real quantosAcimaDe5 = 0.0
		real percentualAcimaDe5 = 0.0
		
		escreva("Digite seu nome: ")
		leia(nome)

		escreva("Como prefere ser chamade(a/o/u)?: ")
		leia(pronome)

		para(inteiro x=1;x<quantidade; x++) {
			escreva("digite uma nota: ")
			leia(nota)
			somaNotas = somaNotas + nota
			//inversão
			se(nota > maiorNota) {
				maiorNota = nota
			}
			se(nota > 5){
				quantosAcimaDe5++
			}
		}
		percentualAcimaDe5 = (quantosAcimaDe5 /quantidade) * 100.00
		media = (somaNotas / quantidade)
		se (media <media_escolar) {
			escreva("oi ",nome," a sua media é: ", media, "você sera reuperad",pronome," em notas !! \n")
		}

		senao se(media >=5.00) {
		escreva("oi ",nome," a sua media é: ", media, " você sera aprovad ",pronome," em notas !! \n ")
		
		}

		escreva(" \n A maior nota foi: ",maiorNota,"\n")
		escreva("\n quantidade de notas acima de 5 ",quantosAcimaDe5,"\n")
		escreva("\npercentual de notas acima de 5 ",percentualAcimaDe5,"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1153; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */