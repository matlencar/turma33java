package classes;

public class TestePolimorfismo {
	public static void main (String args[]) {
		PessoaFisica fisica = new PessoaFisica();
		fisica.setNome("Juliana");
		fisica.setCpf(12345678900l);
		
		
		PessoaJuridica juridica = new PessoaJuridica();
		juridica.setNome("jose");
		juridica.setCnpj(1001222578610L);
		
		Pessoa1[] pessoas = new Pessoa1[2];
		pessoas[0]=fisica;
		pessoas[1]=juridica;
		
		for(Pessoa1 pessoa:pessoas) {
			System.out.println(pessoa.getNome());
		}
	}
}
