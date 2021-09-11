package exerciciofuncionarioclasse;

public class Terceiro extends Funcionario{
	
	protected double adicional;

	public Terceiro(String matricula, String nome, double adicional, double d) {
		super(matricula, nome);
		this.adicional = adicional;
	}

	public Terceiro(String matricula, int horasTrabalhadas, double valorHora, String nome, double adicional) {
		super(matricula, horasTrabalhadas, valorHora, nome);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	//metodos
	
	@Override
	public double salario() {
		return(this.horasTrabalhadas*this.valorHora)+this.adicional;
		
	}
	
}
