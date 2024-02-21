package conta;

import java.util.Scanner;
import conta.util.Cores;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int opcao;

		// Teste classe Conta Corrente
		ContaCorrente contaCorrente1 = new ContaCorrente(1, 123, 1, "User", 1000.00f);
		contaCorrente1.visualizar();
		contaCorrente1.sacar(12000.0f);
		contaCorrente1.visualizar();
		contaCorrente1.depositar(5000.0f);
		contaCorrente1.visualizar();

		// Teste classe Conta Poupança
		ContaPoupanca contaPoupanca1 = new ContaPoupanca(1, 123, 1, "User", 2000.00f);
		contaPoupanca1.visualizar();
		contaPoupanca1.sacar(1000.0f);
		contaPoupanca1.visualizar();
		contaPoupanca1.depositar(5000.0f);
		contaPoupanca1.visualizar();

		while (true) {
			System.out.println(
					Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND + "---------------------------------------------");
			System.out.println("                BANCO FELIZ                  ");
			System.out.println("---------------------------------------------");
			System.out.println("                                             ");
			System.out.println("    1 - Criar Conta                          ");
			System.out.println("    2 - Listar todas as Contas               ");
			System.out.println("    3 - Buscar Conta por Número              ");
			System.out.println("    4 - Atualizar Dados da Conta             ");
			System.out.println("    5 - Apagar Conta                         ");
			System.out.println("    6 - Sacar                                ");
			System.out.println("    7 - Depositar                            ");
			System.out.println("    8 - Transferência entre Contas           ");
			System.out.println("    9 - Sair                                 ");
			System.out.println("                                             ");
			System.out.println("---------------------------------------------");
			System.out.println("   Opção desejada:                           ");
			System.out.println("---------------------------------------------" + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println(Cores.TEXT_YELLOW_BOLD + "\nBanco Feliz - Sempre sorrindo com você!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_YELLOW + "Criar Conta\n");

				break;
			case 2:
				System.out.println(Cores.TEXT_YELLOW + "Listar todas as Contas\n");

				break;
			case 3:
				System.out.println(Cores.TEXT_YELLOW + "Buscar Conta por Número\n");

				break;
			case 4:
				System.out.println(Cores.TEXT_YELLOW + "Atualizar dados da Conta\n");

				break;
			case 5:
				System.out.println(Cores.TEXT_YELLOW + "Apagar Conta\n");

				break;
			case 6:
				System.out.println(Cores.TEXT_YELLOW + "Saque\n");

				break;
			case 7:
				System.out.println(Cores.TEXT_YELLOW + "Depósito\n");

				break;
			case 8:
				System.out.println(Cores.TEXT_YELLOW + "Transferência entre Contas\n");

				break;
			default:
				System.out.println(Cores.TEXT_GREEN_BOLD + "\nOpção Inválida!\n");
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("-----------------------------------------");
		System.out.println("Projeto Desenvolvido por:");
		System.out.println("Dafne Duda - dafne.leslie@gmail.com");
		System.out.println("https://github.com/dafneduda");
		System.out.println("-----------------------------------------");
	}

}
