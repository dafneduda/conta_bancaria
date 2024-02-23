package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import conta.util.Cores;
import conta.controller.ContaController;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {

	public static void main(String[] args) {

		ContaController contas = new ContaController();

		Scanner leia = new Scanner(System.in);

		int opcao, numero, agencia, tipo, aniversario;
		String titular;
		float saldo, limite;

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

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 9) {
				System.out.println(Cores.TEXT_YELLOW_BOLD + "\nBanco Feliz - Sempre sorrindo com você!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_YELLOW + "Criar Conta\n");

				System.out.println("Digite o número da Agência: ");
				agencia = leia.nextInt();
				System.out.println("Digite o Nome do Titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();

				do {
					System.out.println("Digite o Tipo de Conta (1 para CC ou 2 para CP): ");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);

				System.out.println("Digite o Saldo da Conta (R$): ");
				saldo = leia.nextFloat();

				switch (tipo) {
				case 1: {
					System.out.println("Digite o Limite de Crédito (R$): ");
					limite = leia.nextFloat();
					contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
				}
				case 2: {
					System.out.println("Digite o Dia do aniversário da Conta: ");
					aniversario = leia.nextInt();
					contas.cadastrar(
							new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
					}
				}

				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_YELLOW + "Listar todas as Contas\n");
				contas.listarContas();
				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_YELLOW + "Buscar Conta por Número\n");

				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_YELLOW + "Atualizar dados da Conta\n");

				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_YELLOW + "Apagar Conta\n");

				keyPress();
				break;
			case 6:
				System.out.println(Cores.TEXT_YELLOW + "Saque\n");

				keyPress();
				break;
			case 7:
				System.out.println(Cores.TEXT_YELLOW + "Depósito\n");

				keyPress();
				break;
			case 8:
				System.out.println(Cores.TEXT_YELLOW + "Transferência entre Contas\n");

				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_GREEN_BOLD + "\nOpção Inválida!" + Cores.TEXT_RESET);

				keyPress();
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

	public static void keyPress() {

		try {
			System.out.println(Cores.TEXT_RESET + "\nPressione ENTER para continuar.");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Tecla pressionada diferente de ENTER.");
		}
	}
}
