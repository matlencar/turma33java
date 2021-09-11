package classes;

public class Cachorro2 extends Animal2{

	public Cachorro2(String nome, int idade) {
		super(nome, idade);
		
	}
	public void correr() {
		System.out.println("Cachorro sai correndo freneticamente........");
	}
	@Override
	public void emitirSom() {
		System.out.println("Auu..Auuuu.Auuuuu.. ");
	}
}
