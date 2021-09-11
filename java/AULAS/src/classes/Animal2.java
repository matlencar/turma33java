package classes;

public class Animal2 {
	private String nome;
	private int idade;

	//construtor
	public Animal2(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	//encapsulamento - getters and setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
		
	//metodos
	public void emitirSom() {
		System.out.println("Emitindo som....");
	}
	}
