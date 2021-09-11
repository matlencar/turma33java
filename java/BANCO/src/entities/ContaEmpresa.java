package entities;

    public class ContaEmpresa extends Conta{

    //atributos
    private double emprestimoEmpresa;
    private double limiteAtual;

    //construtor
    public ContaEmpresa(int numero, String cpf, double emprestimoEmpresa) {
        super(numero, cpf);
        this.emprestimoEmpresa = emprestimoEmpresa;
    }
    //encapsulamento
    public double getEmprestimoEmpresa() {
        return emprestimoEmpresa;
    }

    public void setEmprestimoEmpresa(double emprestimoEmpresa){
        this.emprestimoEmpresa = emprestimoEmpresa;
    }
    //metodos
    public void pedirEmprestimo(double valorSolicitado) {

            if (valorSolicitado <= limiteAtual) {
                this.limiteAtual = (limiteAtual - valorSolicitado);
                super.credito(getSaldo()+valorSolicitado);
            }
    	}
    }

