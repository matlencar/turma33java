package classes;

public class Cavalo2 extends Animal2{

	public Cavalo2(String nome, int idade) {
		super(nome, idade);
	}
	public void correr() {
		System.out.println("Cavalo sai Galopando ao ar livre......");
	}
	@Override
	public void emitirSom() {
		System.out.println("iihhhhhhhhhhhhhh ");
	}
}
