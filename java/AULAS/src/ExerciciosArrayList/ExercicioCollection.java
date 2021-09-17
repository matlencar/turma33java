package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ExercicioCollection {
	public static void main(String args[]) {
		
		Collection<String> nomes = new ArrayList();
		nomes.add("Mario");
		nomes.add("Maria");
		nomes.add("Juliana");
		nomes.add("Rafaela");
		Collection<String> nomes2 = Arrays.asList("João","Joana");
		nomes.addAll(nomes2);
		System.out.println("Lista de nomes: "+nomes);
		
		for(String name:nomes) {
			System.out.println("Lista de nomes: "+name);
		}
		
		/*System.out.println("Contem o nome Maria?: "+nomes.contains("Maria"));
		System.out.println("Lista: "+nomes);
		/*System.out.println("Lista de nomes: "+nomes);
		nomes.clear();
		System.out.println("Lista de nomes: "+nomes);
		/*System.out.println("Lista de nomes: "+nomes);
		nomes.remove("Mario");
		System.out.println("Lista de nomes: "+nomes);
		/*if(nomes.isEmpty()) {
			System.out.println("Lista vazia... ");
		}
		else {
			System.out.println("Lista de nomes: "+nomes);
		}
		*///System.out.println("Lista de nomes: "+nomes);
	}
}
