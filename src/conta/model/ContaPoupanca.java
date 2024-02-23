package conta.model;

public class ContaPoupanca extends Conta {
	
	//Dia do aniversário da Conta Poupança
	private int aniversario;

	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo) {
		super(numero, agencia, tipo, titular, saldo);
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Aniversário da Conta " + this.aniversario);
	}

}
