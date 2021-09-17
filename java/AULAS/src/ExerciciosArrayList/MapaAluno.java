package ExerciciosArrayList;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {
	public static void main(String args[]) {
		Map<String,ExercicioCollection2> mapa = new TreeMap<String,ExercicioCollection2>();
		
				
		ExercicioCollection2 a = new ExercicioCollection2("João da Silva","Java",6.8);
		ExercicioCollection2 b = new ExercicioCollection2("Maria Souza","Linux",7.8);
		ExercicioCollection2 c = new ExercicioCollection2("Renata Almeida","SO",8.8);
		ExercicioCollection2 d = new ExercicioCollection2("Jose Nascimento","Internet",6.8);
		
		mapa.put("João da Silva",a);
		mapa.put("Maria Souza",b);
		mapa.put("Renata Almeida",c);
		mapa.put("Jose Nascimento",d);
		
		System.out.println(mapa);
		System.out.println(mapa.get("Renata Almeida"));
		
		Collection<ExercicioCollection2> alunos = mapa.values();
		for(ExercicioCollection2 e:alunos) {
			System.out.println(e);
		}
	}
}
