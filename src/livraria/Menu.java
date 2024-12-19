package livraria;

import java.util.InputMismatchException;
import java.util.Scanner;

import livraria.controller.LivrariaController;
import livraria.model.Livro;
import livraria.util.Cores;

public class Menu {

	public static void main(String[] args) {

		LivrariaController obras = new LivrariaController();
		Scanner leia = new Scanner(System.in);

		int opcao, paginas, tipoComercio, numero;
		String nome, autor, categoria;
		float precoCompra;

		while (true) {

			System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLACK_BACKGROUND
					+ "*********************************************************");
			System.out.println("                                                         ");
			System.out.println("                 LIVRARIA MACHADO DE ASSIS               ");
			System.out.println("                                                         ");
			System.out.println("*********************************************************");
			System.out.println("                                                         ");
			System.out.println("             1 - Cadastrar Novo Livro                    ");
			System.out.println("             2 - Listar Todos Os Livros do Estoque       ");
			System.out.println("             3 - Apagar Livro do Estoque                 ");
			System.out.println("             9 - Sair                                    ");
			System.out.println("                                                         ");
			System.out.println("*********************************************************");
			System.out.println("                                                         ");
			System.out.println("Entre Com A Opção Desejada:                              ");
			System.out.println("                                                         " + Cores.TEXT_RESET);

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLACK_BACKGROUND
						+ "\nLivraria Machado de Assis agradece seu interesse pela leitura!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Cadastrar Novo Livro \n\n");

				System.out.println("Digite o Nome do Livro: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
				System.out.println("Digite o Nome do/da Autor(a) da Obra: ");
				leia.skip("\\R?");
				autor = leia.nextLine();
				System.out.println("Digite a Categoria do Livro: ");
				leia.skip("\\R?");
				categoria = leia.nextLine();
				System.out.println("Digite o Número de Páginas do Livro: ");
				leia.skip("\\R?");
				paginas = leia.nextInt();

				do {
					System.out.println("Digite o Tipo de Transação que quer realizar: 1 - Comprar ou 2 - Alugar");
					tipoComercio = leia.nextInt();
				} while (tipoComercio < 1 && tipoComercio > 2);

				switch (tipoComercio) {
				case 1 -> {
					System.out.println("Digite o valor para compra (R$): ");
					precoCompra = leia.nextFloat();
					obras.cadastrar(
							new Livro(obras.gerarNumero(), nome, autor, categoria, paginas, tipoComercio, precoCompra));

				}
				case 2 -> {
					System.out.println("OPÇÃO INDISPONÍVEL");

				}
				}

				keyPress();
				break;

			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar Todos Os Livros \n\n");
				obras.listarTodos();
				keyPress();
				break;

			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar Livro do Estoque\n\n");

				System.out.println("Digite o número correspondente ao Livro: ");
				numero = leia.nextInt();

				obras.deletar(numero);

				keyPress();
				break;

			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nEssa opção não existe // Escolha um número válido! \n"
						+ Cores.TEXT_RESET);

				keyPress();
				break;
			}
		}
	}

	private static void keyPress() {
		// TODO Auto-generated method stub

	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("\nProjeto Desenvolvido por: Tainá Lara");
		System.out.println("Contato: tainalara.dev@gmail.com");
		System.out.println("https://github.com/tainalara");
		System.out.println("\n*********************************************************");
	}

}
