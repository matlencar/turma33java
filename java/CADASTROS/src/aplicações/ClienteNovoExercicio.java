package aplicações;

import classes.Cliente;

public class ClienteNovoExercicio {

	public static void main(String[] args) {
		Cliente clienteNovo = new Cliente(null);
		
		clienteNovo.nome="Raimundo";
		clienteNovo.calculeIdade();
		clienteNovo.cpf= "88899944413";
		clienteNovo.negativado=true;
		
		Cliente clienteNovo2 = new Cliente(null);
		
		clienteNovo.nome="Maria";
		clienteNovo.calculeIdade();
		clienteNovo.cpf= "12345678900";
		clienteNovo.negativado=false;
		
		
		

	}

}
