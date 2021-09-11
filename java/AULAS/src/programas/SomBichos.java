package programas;

import classes.Cachorro2;
import classes.Cavalo2;
import classes.Preguica2;

public class SomBichos {

	public static void main(String[] args) {
		
		Cachorro2 dog = new Cachorro2("Poodle", 5);
		Cavalo2 pangare = new Cavalo2("Alasão", 3);
		Preguica2 Donapreguica = new Preguica2("Dona Preguiça",4);
		
		dog.emitirSom();
		pangare.emitirSom();
		Donapreguica.emitirSom();

		pangare.correr();
		dog.correr();

		Donapreguica.subirArvore();

	}

}
