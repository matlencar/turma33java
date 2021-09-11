package classes;

public class Preguica2 extends Animal2 {

	public Preguica2(String nome, int idade) {
		super(nome, idade);
	}
	public void subirArvore() {
		System.out.println("Preguiça lentamente subindo na arvore....... ");
	}
	@Override
	public void emitirSom() {
		System.out.println("......................... ");
	}
}
