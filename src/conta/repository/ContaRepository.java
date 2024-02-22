package conta.repository;

import conta.model.Conta;

public interface ContaRepository {

	// Métodos do CRUD (Create, Read, Update e Delete) da classe Conta
	public void procurarPorNumero(int numero);
	public void listarContas();
	public void criar(Conta conta);
	public void atualizar(Conta conta);
	public void apagar(int numero);

	// Métodos bancários
	public void sacar(int numero, float valor);
	public void depositar(int numero, float valor);
	public void transferir(int numeroOrigem, int numeroDestino, float valor);

}