package classes;

public class ExercicioAviao {
	public String companhiaAerea;
	public boolean decolarAviao;
	public boolean aterrissagem;
	public int velocidadeAviao;
	

	public void decolaAviaor() {
		System.out.printf("Apertem os cintos o avi�o da %s est� decolando..\n",this.companhiaAerea);
		this.decolarAviao = true;
	}
	public void Velociodade() {
		System.out.printf("A atual velocidade do avi�o � de %s \n",this.companhiaAerea);
		this.velocidadeAviao++;
		
		if(this.velocidadeAviao==10) {
			subindo();
		}
	}
	private void subindo() {
		
		
	}
	public void Descacelerando() {
		System.out.printf("O avi�o da companhia %s est� des�acelerando a velocidade \n",companhiaAerea);
		this.velocidadeAviao --;
		if(this.velocidadeAviao==7);
		pouso();
	}
	private void pouso() {
		
		
	}
}
