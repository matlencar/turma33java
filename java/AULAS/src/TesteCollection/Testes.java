package TesteCollection;

import java.util.HashSet;
import java.util.Set;

import ExerciciosArrayList.ExercicioCollection2;

public class Testes {

	public static void main(String[] args) {
		Set<ExercicioCollection2> conjunto = new HashSet<ExercicioCollection2>();
		ExercicioCollection2 a = new ExercicioCollection2("João da Silva","Java",6.8);
		ExercicioCollection2 b = new ExercicioCollection2("Maria Souza","Linux",7.8);
		ExercicioCollection2 c = new ExercicioCollection2("Renata Almeida","SO",8.8);
		ExercicioCollection2 d = new ExercicioCollection2("Jose Nascimento","Internet",6.8);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		
		System.out.println(conjunto);

	}

}
