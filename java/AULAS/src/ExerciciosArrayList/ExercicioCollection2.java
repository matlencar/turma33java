package ExerciciosArrayList;

public class ExercicioCollection2 {
	private String nome;
	private String curso;
	private double nota;
	


	public ExercicioCollection2(String nome, String curso, double nota) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.nota = nota;
	}

	public String toString() {
		return this.nome;
	}
	//encapsulamento
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
}
