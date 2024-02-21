package conta.model;

public class ContaCorrente extends Conta {

	private float limite;

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	@Override
	public boolean sacar(float valor) {
		if (this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\nSaldo Insuficiente.");
			return false;
		}
		this.setSaldo(this.getSaldo() - valor);
		System.out.println("\nValor sacado com sucesso, use com sabedoria!");
		return true;

	}

}