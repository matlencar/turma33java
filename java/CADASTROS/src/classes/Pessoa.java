package classes;

public class Pessoa {
	
	//atributos - é, tem, estar
	public String primeiroNome;
	public String ultimoNome;
	public String nomesDOMeio;
	
	//metodo
	public void Pessoa(String primeiro,String meio, String ultimo) {
		primeiroNome=primeiro;
		ultimoNome=ultimo;
		nomesDOMeio=meio;
		
	}
	
	public String getNomeCompleto() {
		String nomeCompleto = primeiroNome+" "+nomesDOMeio+" "+ultimoNome;
		return nomeCompleto;
	}
	
}
